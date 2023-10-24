package za.ac.cput.controller;

import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.ContactUs;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactUsController {

    private final JavaMailSender emailSender;

    @Autowired
    public ContactUsController(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submitContactForm(@RequestBody ContactUs contactUs) {
        try {
            // Create a MimeMessage
            MimeMessage message = emailSender.createMimeMessage();

            // Use MimeMessageHelper to set up the email
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo("codingcubeteam@gmail.com"); // Replace with the recipient's email address
            helper.setSubject("Contact Form Submission");
            helper.setFrom(contactUs.getEmail());
            helper.setText("Name: " + contactUs.getName() + "\nEmail: " + contactUs.getEmail() + "\nMessage: " + contactUs.getMessage());

            // Send the email
            emailSender.send(message);

            return ResponseEntity.ok("Contact form submitted successfully and email sent!");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Failed to submit the contact form.");
        }


    }

}



