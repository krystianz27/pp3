public class BookTest {
    
    public static void main(String[] args) {
        Book book1 = new Book("Title1", "Author1");
        book1.display();

        Ebook ebook2 = new Ebook("Title2", "Author2", "Ebook");
        ebook2.display();

        Audiobook audiobook1 = new Audiobook("Title3", "Author3", 80, 20);
        audiobook1.display();
    }
}
