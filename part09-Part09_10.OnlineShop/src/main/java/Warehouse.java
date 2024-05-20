import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> warehousePrice;
    private Map<String, Integer> warehouseStock;

    public Warehouse(){
        this.warehousePrice = new HashMap<>();
        this.warehouseStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.warehousePrice.put(product, price);
        this.warehouseStock.put(product, stock);
    }

    public int price(String product){
        int price = 0;
        if(!(this.warehousePrice.get(product) == null)){
            price = this.warehousePrice.get(product);
        }else{
            price = -99;
        }
        return price;
    }

    public int stock(String product){
        int stock = 0;
        if(!(this.warehouseStock.get(product) == null)){
            stock = this.warehouseStock.get(product);
        }else{
            stock = 0;
        }
        return stock;
    }

    public boolean take(String product){
        if(this.stock(product) > 0){
            this.warehouseStock.put(product, warehouseStock.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products(){
            return this.warehousePrice.keySet();
    }
}
