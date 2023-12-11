import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> shoppingList;

    public ShoppingList() {
        this.shoppingList = new ArrayList<>();
    }

    public void add(Product product) {
        shoppingList.add(product);
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        for (Product product : shoppingList) {
            output.append(product.getName() + ",");
        }

        String result = output.substring(0, output.length() - 1).toString();

        return result;
    }

    public int total() {
        int counter = 0;
        for (Product product : shoppingList) {
            counter += product.getQuantity();
        }
        return counter;
    }

}
