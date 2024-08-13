package onlineshoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        Electronics laptop = new Electronics("Laptop", 50000, "2 years");
        Electronics mobile = new Electronics("Mobile", 5000, "2 years" );
        Clothing tshirt = new Clothing("T-Shirt", 500, "M");

        List<Product> products = new ArrayList<>();
        products.add(laptop);
        products.add(mobile);
        products.add(tshirt);
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove the item from the cart");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Available products:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i).getName() + " - rs " + products.get(i).getPrice());
                    }
                    System.out.print("Enter the number of the products to add: ");
                    int productNumber = sc.nextInt();
                    if (productNumber > 0 && productNumber <= products.size()) {
                        cart.addItem(products.get(productNumber - 1));
                        System.out.println("Product added to cart.");
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;
                case 2:
                    System.out.println("Cart items:");
                    List<String> cartItems = cart.listItems();
                    for (int i = 0; i < cartItems.size(); i++) {
                        System.out.println((i + 1) + ". " + cartItems.get(i));
                    }
                    System.out.print("Enter the number of the product to remove: ");
                    int removeNumber = sc.nextInt();
                    if (removeNumber > 0 && removeNumber <= cartItems.size()) {
                        cart.removeItem(products.get(removeNumber - 1));
                        System.out.println("Product removed from cart.");
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;
                case 3:
                    System.out.println("Cart items:");
                    for (String item : cart.listItems()) {
                        System.out.println(item);
                    }
                    System.out.println("Total price: $" +  cart.totalPrice());
                    break;
                case 4:
                    Order order = new Order(cart);
                    System.out.println(order.checkout());

                    break;

                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
