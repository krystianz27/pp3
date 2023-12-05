public class Ebook extends Book {
    private String filename;

    Ebook(String title, String author, String filename){
        super(title, author);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void display() {
        System.out.println(getTitle() +" " + getAuthor() + " " + filename);
    }

}
