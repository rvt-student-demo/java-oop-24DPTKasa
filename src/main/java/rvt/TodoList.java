package rvt;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
        ArrayList<String> todolist = new ArrayList<>();
        private final String filePath = "data\\todo.csv";
        private int getLastId(){
            return 0;
        }
        public void loadFromFile(){
            try(Scanner scanner = new Scanner(filePath)){
                while(scanner.hasNextLine()){
                    String row = scanner.nextLine();
                    String[] parts = row.split(",");
                    todolist.add(parts[0]);
                }
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            } 
        }

        public void loadToFile() {
            try (PrintWriter writer = new PrintWriter(filePath)) {
                for (String task : todolist){
                    writer.println(task);                
            } }catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }

        }
        

        public void add(String task)
        {
            todolist.add(task);  // adds the word to list
            System.out.println(" '" + task + "'" + "added!");
            getLastId();
        }
    

        public void print()
        {
            for(int i = 0; todolist.size() > i; i++) {
                System.out.println((i+1) + ":" + todolist.get(i));
                } // prints the list until all list is printed 
            }
        
        


        public void remove(int number)
        {
            todolist.remove(number);
            System.out.printf("It removed! %n" + todolist);
        }    
    
    
    
    
}
