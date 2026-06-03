package rvt.Online_shop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.items.containsKey(product)) {
            this.items.get(product).increaseQuantity();
        } else {
            this.items.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int totalPrice =0;
        for (Item item : this.items.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : this.items.values()) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add("Milk", 3);
        cart.add("buttermilk", 2);
        cart.add("chocolate", 10);

        System.out.println("Items in your cart:");
        cart.print();
        System.out.println("Total price: " + cart.price());
    }

}
