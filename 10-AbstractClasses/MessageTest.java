public class MessageTest {
    public static void main(String[] args) {
        User user1 = new User("John", "Doe", "john@example.com", "123-456-7890");
        User user2 = new User("Jane", "Doe", "jane@example.com", "098-765-4321");

        Message sms = new SMS(user1, "Hello, this is an SMS message!");
        Message email = new Email("Greetings", user2, "Hello, this is an email message!");

        sms.send();
        email.send();
    }
}
