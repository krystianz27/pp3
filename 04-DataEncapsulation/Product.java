public class Product {
    private String name;
    private boolean vege;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getVege() {
        return vege;
    }

    public void setVege(boolean vege) {
        this.vege = vege;
    }

    @Override
    public String toString() {
        return name + " Vege: " + vege;
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Product1");
        product1.setVege(true);
        System.out.println(product1.getName());
        System.out.println(product1.getVege());
        System.out.println(product1);
    }

}
