public class C6 {
    private String title;
    private int pages;

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setPages(int n) {
        if (n > 0) {
            this.pages = n;
        }
    }

    public static void main(String[] args) {
        C6 o = new C6();
        o.setPages(3);
        o.setPages(-4);
        o.setTitle("Title1");
        System.out.println(o.getPages());
        System.out.println(o.getTitle());
    }
}
