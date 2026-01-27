package rvt;
import java.util.Scanner;

public class Todolist_test {
    public static void main(String[] args) {
        TodoList list = new TodoList();{
        Scanner scanner = new Scanner(System.in); 
        list.add(scanner.nextLine());
        list.print();
        list.remove(0);
        }
    }
}
