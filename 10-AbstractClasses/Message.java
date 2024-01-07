public abstract class Message {
    // Private text attribute for the message
    private String text;

    // Parameterless constructor for an empty message
    public Message() {
        this.text = "";
    }

    // Constructor with one parameter to create a message with given content
    public Message(String text) {
        this.text = text;
    }

    // Accessor (getter) method for the text attribute
    public String getText() {
        return text;
    }

    // Mutator (setter) method for the text attribute
    public void setText(String text) {
        this.text = text;
    }

    // Method to return the number of characters in the message
    public int charNumber() {
        return text.length();
    }

    // Abstract method for sending the message
    public abstract void send();
}
