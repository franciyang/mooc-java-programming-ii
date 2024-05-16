import java.util.ArrayList;

public class OneItemBox extends Box{
    private int capacity;
    private ArrayList<Item> itemsInBox;

    public OneItemBox(){
        super();
        this.capacity = 1;
        this.itemsInBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.itemsInBox.size() < capacity){
            this.itemsInBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.itemsInBox.contains(item);
    }
    
}
