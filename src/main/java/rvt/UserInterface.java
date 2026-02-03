package rvt;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    TodoList list = new TodoList();

    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("add")){
                System.out.println("To add?:");
                String task = scanner.nextLine();
                list.add(task);
            } 
                else if (command.equals("list")) {
                    list.print();
            } 
                    else if(command.equals("remove")) {
                        System.out.println("Which task should be removed?(write number): ");
                        int number = Integer.valueOf(scanner.nextLine());
                        list.remove(number);
            } 
                        else if (command.equals("stop")){
                            break;
            }
        }
    }
}
