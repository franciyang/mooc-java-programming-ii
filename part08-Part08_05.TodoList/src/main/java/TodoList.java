import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }

    public void add(String task){
        this.list.add(task);
    }

    public void print(){
        for(String i : list){
            int number = list.indexOf(i) + 1;
            System.out.println(number + ": " + i);
        }
    }

    public void remove(int number){
        int index = number - 1;
        list.remove(index);
    }
}
