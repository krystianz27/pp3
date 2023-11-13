public class StringTest {
    public static void main(String[] args) {
        String text = "Have a nice day!";

        System.out.println(text.length());
        System.out.println(text.substring(0, 10));
        System.out.println(text.endsWith("day!"));
        System.out.println(text.isEmpty());
        System.out.println(text.lastIndexOf("e"));
        System.out.println(text.replace("\s", "-"));
        System.out.println(text.toUpperCase());
    }

}
