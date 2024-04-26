
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }else if(number > 0){
                list.add(number);
            }
        }
        if(list.size() == 0){
            System.out.println("Cannot calculate the average");
        }else{
            int sum = 0;
            for(int i : list){
                sum += i;
            }
            if(sum > 0){
                System.out.println(1.0 * sum / list.size());
            }
        }
    }
}
