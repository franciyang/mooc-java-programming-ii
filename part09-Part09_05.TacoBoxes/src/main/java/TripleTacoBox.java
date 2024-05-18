public class TripleTacoBox implements TacoBox{
    public int tacos;

    public TripleTacoBox(){
        this.tacos = 3;
    }

    public int tacosRemaining(){
        return tacos;
    }

    public void eat(){
        if(this.tacos >= 1){
            this.tacos --;
        }
    }
}
