package rvt.Online_shop;

public class Item {
    Warehouse warehouse = new Warehouse();
    private Object product;
    private int qty;
    private int unitPrice;

    public Item(String Product, int qty, int unitPrice){ // qty - quantity, unitPrice - price for one item
        // this.product = warehouse.products().get(Product);
        // this.qty = qty; 
        // this.unitPrice = unitPrice;
    }

    public int price(){
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity(){
        this.qty++;
    }

    public String toString(){
        return this.product + ": " + this.qty;
    }
}
