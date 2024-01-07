public class SMS extends Message {
    private User recipient;

    public SMS(User recipient, String text) {
        super(text);
        this.recipient = recipient;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + recipient.getPhoneNumber() + ": " + getText());
    }
}
