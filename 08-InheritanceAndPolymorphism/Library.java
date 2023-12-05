import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        Book book1 = new Book("Title1", "Author1");
        Ebook ebook2 = new Ebook("Title2", "Author2", "Ebook");
        Audiobook audiobook1 = new Audiobook("Title3", "Author3", 80, 20);

        books.add(book1);
        books.add(ebook2);
        books.add(audiobook1);

        for (Book book : books) {
            book.display();  
        }
    }
}
