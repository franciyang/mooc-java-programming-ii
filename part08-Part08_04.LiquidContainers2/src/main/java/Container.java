public class Container {
    private int liquid;

    public Container(){
        this.liquid = 0;
    }

    public void add(int amount){
        if(amount > 0){
            if(this.liquid + amount >= 100){
                this.liquid = 100;
            }else{
                this.liquid += amount;
            }
        }
    }

    public void moveLiquid(int amount, Container second){
        if(amount > 0){
            if(this.liquid >= amount){
                second.add(amount);
                this.liquid -= amount;
            }else if(this.liquid < amount){
                second.add(this.liquid);
                this.liquid = 0;
            }
        }
    }

    public void remove(int amount){
        if(amount > 0){
            if(this.liquid >= amount){
                this.liquid -= amount;
            }else if(this.liquid < amount){
                this.liquid = 0;
            }
        }
    }

    public int contains(){
        return this.liquid;
    }

    @Override
    public String toString(){
        return this.liquid + "/100";
    }
}
