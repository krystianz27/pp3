public class Book {
    private String title, author;
    private Publisher name, city;

    public Book(String title, String author, Publisher name, Publisher city) {
        this.title = title;
        this.author = author;
        this.name = name;
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println(title +" " + author);
    }

    public Publisher getName() {
        return name;
    }

    public void setName(Publisher name) {
        this.name = name;
    }

    public Publisher getCity() {
        return city;
    }

    public void setCity(Publisher city) {
        this.city = city;
    }

}