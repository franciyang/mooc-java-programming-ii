
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashmap){
        for(Book title : hashmap.values()){
            System.out.println(title);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text){
        for(Book title : hashmap.values()){
            if(title.getName().contains(text)){
                System.out.println(title);
            }
        }
    }

}
