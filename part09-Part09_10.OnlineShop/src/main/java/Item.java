public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price(){
        int totalPrice = this.qty * this.unitPrice;
        return totalPrice;
    }

    public void increaseQuantity(){
        this.qty ++;
    }

    public String toString(){
        return this.product + ": " + this.qty;
    }

    public int quantity(){
        return qty;
    }
}
