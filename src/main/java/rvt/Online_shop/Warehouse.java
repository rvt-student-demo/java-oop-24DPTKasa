package rvt.Online_shop;

import java.util.HashMap;

public class Warehouse {
    private HashMap<String, Integer> products;
    
    public Warehouse() {
        this.products = new HashMap<>(); 
    }

    public void addProduct(String Product, int price, int stock){
        this.products.put(Product, price);
    }

    public int price(String Product){
        if (Product.isEmpty()){
            return -99;
        }
        return this.products.getOrDefault(Product, -99);
    }
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);
        
        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));
    }
}
