import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> box;

    public Box(double capacity){
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }

    public void add(Packable b){
        if(weight() + b.weight() <= capacity){
            box.add(b);
        }
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for(Packable a : box){
            totalWeight += a.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString(){
        return "Box: " + this.box.size() + " items, total weight " + weight() + " kg";
    }

    
}
