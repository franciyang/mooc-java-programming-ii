import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }

        if(object == null){
            return false;
        }
        
        if(!(object instanceof Item)){
            return false;
        }

        Item obj = (Item) object;

        if(Objects.equals(this.name, obj.name)){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode(){
        return  Objects.hash(this.name);
    }

}
