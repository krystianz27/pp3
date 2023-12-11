public class Audiobook extends Book {
    private int minutes;
    private int seconds;

    public Audiobook(String title, Writer author, Publisher publisher, int yearOfPublication, int minutes,
            int seconds) {
        super(title, author, publisher, yearOfPublication);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor().getFirstName() + ", " + getAuthor().getLastName());
        System.out.println("Literary Genre: " + getAuthor().getLiteraryGenre());
        System.out.println("Publisher: " + getPublisher().getName() + ", " + getPublisher().getCity());
        System.out.println("Year of Publication: " + getYearOfPublication());
        System.out.println("Duration: " + minutes + " minutes " + seconds + " seconds");
        System.out.println();
    }
}
