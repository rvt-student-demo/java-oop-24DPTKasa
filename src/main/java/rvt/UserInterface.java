package rvt;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    TodoList list = new TodoList();

    public void start() {
        while(true) {
            System.out.println("Command (add; list; remove; stop):");
            String command = scanner.nextLine();   // takes input from user
            if (command.equals("add")){  // checking if input is add
                System.out.println("To add?:");  
                String task = scanner.nextLine();  // takes the input 
                list.add(task); //adds the input to the list
            } 
                else if (command.equals("list")) { // checking if user want to look at the list
                    list.print(); // prints it
            } 
                    else if(command.equals("remove")) { // checking if user wants to remove smth from the list
                        System.out.println("Which task should be removed?(write number): "); 
                        int number = Integer.valueOf(scanner.nextLine()); // takes the input
                        list.remove(number); //  removing from the list by number                
            } 
                        else if (command.equals("stop")){ // checking if you want  to end the programm
                            break;  // ending programm
            }
        }
    }
}
