import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> shoppingCart;

    public ShoppingCart(){
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price){
        if(this.shoppingCart.containsKey(product)){
            this.shoppingCart.get(product).increaseQuantity();
        }else{
            this.shoppingCart.put(product, new Item(product, 1, price));
        }
    }

    public int price(){
        int sum = 0;
        for(Object a: this.shoppingCart.keySet()){
            sum = sum + this.shoppingCart.get(a).price();
        }
        return sum;
    }

    public void print(){
        for(Map.Entry<String, Item> a: this.shoppingCart.entrySet()){
            System.out.println(a.getKey() + ": " + this.shoppingCart.get(a.getKey()).quantity());
        }
    }
}
