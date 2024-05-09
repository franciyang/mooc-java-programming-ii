import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> plates;
    
    public VehicleRegistry(){
        this.plates = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(this.plates.containsKey(licensePlate)){
            return false;
        }else{
            plates.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate){
        if(!(this.plates.containsKey(licensePlate))){
            return null;
        }else{
            return this.plates.get(licensePlate);
        }
    }

    public boolean remove(LicensePlate licensePlate){
        if(!(this.plates.containsKey(licensePlate))){
            return false;
        }else{
            this.plates.remove(licensePlate);
            return true;
        }
    }

    public void printLicensePlates(){
        for(LicensePlate a : plates.keySet()){
            System.out.println(a);
        }
    }

    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(LicensePlate a : plates.keySet()){
            if(owners.contains(plates.get(a))){
                continue;
            }else{
                System.out.println(plates.get(a));
                owners.add(plates.get(a));
            }
        }
    }
}
