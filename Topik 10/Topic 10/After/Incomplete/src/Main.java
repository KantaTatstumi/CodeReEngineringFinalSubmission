public class Main {
    public static void main(String[] args) {
           EmailService emailService = new SmtpEmailService("smtp.example.com", 587, "username", "password");
           emailService.sendEmail("john.doe@example.com", "Hello", "This is a test email.");
       }
}