public class BookTest {
    public static void main(String[] args) {
        // Creating publishers
        Publisher publisher1 = new Publisher("Publisher A", "City A");
        Publisher publisher2 = new Publisher("Publisher B", "City B");

        // Creating writers
        Writer writer1 = new Writer("J.R.R.", "Tolkien", "Fantasy");
        Writer writer2 = new Writer("George", "Orwell", "Dystopian Fiction");
        Writer writer3 = new Writer("Harper", "Lee", "Fiction");

        // Creating a library
        Library library = new Library();

        // Creating instances of Book, Ebook, and Audiobook with respective authors,
        // publishers, and year of publication
        Book book = new Book("The Hobbit", writer1, publisher1, 1937);
        Ebook ebook1 = new Ebook("1984", writer2, publisher2, 1949, "1984_file.pdf");
        Ebook ebook2 = new Ebook("To Kill a Mockingbird", writer3, publisher1, 1960, "mockingbird_file.pdf");
        Audiobook audiobook = new Audiobook("The Lord of the Rings", writer1, publisher2, 1954, 11, 30);

        // Adding items to the library
        library.addItem(book);
        library.addItem(ebook1);
        library.addItem(ebook2);
        library.addItem(audiobook);

        // Displaying the contents of the library
        library.displayLibraryContents();
    }
}
