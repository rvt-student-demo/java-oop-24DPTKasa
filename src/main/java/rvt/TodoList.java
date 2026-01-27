package rvt;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
        ArrayList<String> todolist = new ArrayList<>();
        private final String filePath = "C:\\Users\\A240746TK\\Downloads\\Java\\java-oop-24DPTKasa\\data\\todo.csv";

        public void add(String task)
        {
            todolist.add(task);
            System.out.println(" '" + task + "'" + "added!");
            
        }
    

        public void print()
        {
            for(int i = 0; todolist.size() > i; i++) {
                System.out.println((i+1) + ":" + todolist);
                }
            }
        
        


        public void remove(int number)
        {
            todolist.remove(0);
            System.out.printf("It removed! %n" + todolist);

        }    
    
    
    
    
}
