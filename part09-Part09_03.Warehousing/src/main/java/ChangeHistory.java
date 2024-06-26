import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history; 

    public ChangeHistory(){
        this.history = new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    public double maxValue(){
        double max = 0;
        for(double a : history){
            if(a > max){
                max = a;
            }
        }
        return max;
    }

    public double minValue(){
        double min = history.get(0);
        for(double a : history){
            if(a < min){
                min = a;
            }
        }
        return min;
    }

    public double average(){
        double sum = 0;
        for(double a : history){
            sum += a;
        }
        double average = sum / this.history.size();
        return average;
    }

    @Override

    public String toString(){
        return this.history.toString();
    }
}
