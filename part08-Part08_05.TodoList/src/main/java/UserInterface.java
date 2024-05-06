import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan){
        this.list = list;
        this.scan = scan;
    }

    public void start(){
        while(true){
            System.out.println("Command:");
            String command = String.valueOf(scan.nextLine());
            if(command.equals("stop")){
                break;
            }else if(command.equals("add")){
                System.out.println("To add:");
                String add = String.valueOf(scan.nextLine());
                list.add(add);
            }else if(command.equals("list")){
                list.print();
            }else if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int number = Integer.valueOf(scan.nextLine());
                list.remove(number);
            }
        }
    }
}
