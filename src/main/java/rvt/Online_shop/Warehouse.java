package rvt.Online_shop;

import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    private HashMap<String, Integer> products;
    private HashMap<String, Integer> stocks;

    
    public Warehouse() {
        this.products = new HashMap<>(); 
        this.stocks = new HashMap<>();
    }

    public void addProduct(String Product, int price, int stock){
        this.products.put(Product, price);
        this.stocks.put(Product, stock);
    }

    public int price(String Product){
        if (Product.isEmpty()){
            return -99;
        }
        return this.products.getOrDefault(Product, -99);
    }
    
    public int stock(String Product){
        if (Product.isEmpty()){
            return 0;
        }
        return this.stocks.getOrDefault(Product, 0);
    }

    public boolean take(String Product){
        if (stock(Product) > 0) {
            this.stocks.put(Product, stock(Product) - 1);
            return true;

        }
        if (stock(Product) == 0) {
            return false;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.products.keySet();
    }
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 20);
        warehouse.addProduct("yogurt", 2, 20);

        System.out.println("products:");

        for (String product: warehouse.products()) {
            System.out.println(product);
        }
    }
}
