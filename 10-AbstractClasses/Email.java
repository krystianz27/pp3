public class Email extends Message {
    private String subject;
    private User recipient;

    // Constructor to initialize the subject, content, and recipient (User object)
    public Email(String subject, User recipient, String text) {
        super(text);
        this.subject = subject;
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Implementation of the abstract send() method
    @Override
    public void send() {
        System.out.println("Sending email to: " + recipient.getEmail());
        System.out.println("Subject: " + getSubject());
        System.out.println("Content: " + getText());
    }
}
