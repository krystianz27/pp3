import java.util.ArrayList;

public class Library {
    private ArrayList<Book> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Book item) {
        items.add(item);
    }

    public void displayLibraryContents() {
        System.out.println("Library Contents:");
        for (Book item : items) {
            item.display();
            // System.out.println(item); #print memmory address because item is instance of
            // Book class
        }
    }
}
