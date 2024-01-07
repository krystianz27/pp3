public class C5 {
    String[] words;

    public C5(String[] words) {
        this.words = words;
    }

    public boolean m() {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    if (words[i].equals(words[j])) {
                        return true;
                    }
                } 
            }
        }
        return false;

    }
    
    // public static void main(String[] args) {
    //     String[] w = {"a", "b", "a"};
    //     C5 obj = new C5(w);
    //     System.out.println(obj.m());
    // }
}
