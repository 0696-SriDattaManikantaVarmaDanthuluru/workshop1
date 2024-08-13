package onlineshoppingcart;

import java.util.ArrayList;
import java.util.List;


class Cart {
    private List<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double totalPrice() {
        double sum = 0d;
        for(Product p : items) {
            sum += p.getPrice();
        }
        return sum;
   }

    public List<String> listItems() {
        List<String> itemNames = new ArrayList<>();
        for (Product item : items) {
            itemNames.add(item.getName());
        }
        return itemNames;
    }

}
