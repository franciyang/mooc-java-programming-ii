import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> itemsInBox;
    
    public BoxWithMaxWeight(int capacity){
        super();
        this.capacity = capacity;
        this.itemsInBox = new ArrayList<>();
    }

    public int currentAmount(){
        int sum = 0;
        for(Item a : itemsInBox){
            sum += a.getWeight();
        }
        return sum;
    }

    @Override
    public void add(Item item) {
        if(currentAmount() + item.getWeight() <= capacity){
            itemsInBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return itemsInBox.contains(item);
    }
}
