package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.service.EmailService;

@RestController
@RequestMapping("api/invoices")
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from your Angular app
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(
            @RequestParam String recipientEmail,
            @RequestParam String emailBody
    ) {
        try {
            // Define the email subject
            String emailSubject = "Invoice Information";

            // Call the EmailService to send the email
            emailService.sendEmail(recipientEmail, emailSubject, emailBody);

            // Return a success response
            return ResponseEntity.ok("Email sent successfully");
        } catch (Exception e) {
            // Return an error response in case of an exception
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email sending failed");
        }
    }
}
