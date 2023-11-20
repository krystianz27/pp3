public class C5 {
    public static String m(String t) {
        // int counter = 0;
        int len = t.length();
        String text = "";

        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                text = text + t.substring(i, i + 1) + "+";

            } else {
                text = text + t.substring(i, i + 1) + "-";
            }
        }
        return text.substring(0, text.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(C5.m("water"));
        System.out.println(C5.m("TestOwY NApis"));
        System.out.println(C5.m("T"));
    }

}
