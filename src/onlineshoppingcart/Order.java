package onlineshoppingcart;

import java.util.List;
import java.util.Random;
class Order {
    Random rand = new Random();
    private Cart cart;
    public Order(Cart cart) {
        this.cart = cart;
    }
    long orderID = rand.nextLong(100000);
    public String checkout() {
        double total = cart.totalPrice();
        List<String> items = cart.listItems();

        return "Order placed for " + items + " with total price: Rs" +  total + ". ORDERID:- " + orderID;
        items.removeAll();


    }
}
