public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, Writer author, Publisher publisher, int yearOfPublication, String fileName) {
        super(title, author, publisher, yearOfPublication);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String newFileName) {
        this.fileName = newFileName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("File Name: " + fileName);
        System.out.println();
    }
}
