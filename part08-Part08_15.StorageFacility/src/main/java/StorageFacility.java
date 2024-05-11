import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());

        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if(!(this.storage.containsKey(storageUnit))){
            ArrayList<String> emptyList = new ArrayList<>();
            return emptyList;
        }else{
            return this.storage.get(storageUnit);
        }
    }

    public void remove(String storageUnit, String item){
        this.storage.get(storageUnit).remove(item);
        if(this.storage.get(storageUnit).isEmpty()){
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> names = new ArrayList<>();
        for(String a : this.storage.keySet()){
            if(!(this.storage.get(a).isEmpty())){
                names.add(a);
            }
        }
        return names;
    }
}
