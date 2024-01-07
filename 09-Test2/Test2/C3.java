public class C3 {
    String filename;

    public C3(String filename) {
        this.filename = filename;
    }

    public String m1() {
        int atIndex = filename.lastIndexOf(".");
        return filename.substring(0, atIndex);
    }

        public String m2() {
        int atIndex = filename.lastIndexOf(".");
        return filename.substring(atIndex);
    }

    

    // public static void main(String[] args) {
    //     C3 c1 = new C3("data.k.csv");
    //     System.out.println(c1.m1());
    //     System.out.println(c1.m2());
    // }
}
