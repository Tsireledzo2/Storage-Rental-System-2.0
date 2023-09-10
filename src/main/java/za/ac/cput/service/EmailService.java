package za.ac.cput.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Invoice;

import java.util.List;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendInvoiceEmail(String to, String subject, List<Invoice> invoices) throws MessagingException {
        // Generate HTML content for the email
        String emailContent = generateEmailContent(invoices);

        // Send the email with HTML content
        sendHtmlEmail(to, subject, emailContent);
    }

    private String generateEmailContent(List<Invoice> invoices) {
        StringBuilder content = new StringBuilder("<html><body>");
        content.append("<h1>Your Invoices</h1>");
        content.append("<table>");
        content.append("<tr><th>Invoice Number</th><th>Customer</th><th>Invoice Date</th><th>Amount</th></tr>");

        for (Invoice invoice : invoices) {
            content.append("<tr>");
            content.append("<td>").append(invoice.getInvoiceNumber()).append("</td>");
            content.append("<td>").append(invoice.getCustomerName()).append("</td>");
            content.append("<td>").append(invoice.getInvoiceDate()).append("</td>");
            content.append("<td>").append(invoice.getTotalAmount()).append("</td>");
            content.append("</tr>");
        }

        content.append("</table></body></html>");
        return content.toString();
    }

    private void sendHtmlEmail(String to, String subject, String htmlContent) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(htmlContent, true);

        javaMailSender.send(message);
    }
}
