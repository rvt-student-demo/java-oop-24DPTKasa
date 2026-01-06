package rvt;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class work_with_scv {{
        
    try(Scanner scanner = new Scanner(Paths.get("data/data.csv"))) {
        // Ignore header 
        scanner.nextLine();
        // read file until all lines is have been raden 
        while(scanner.hasNextLine()){
            String row = scanner.nextLine();
            String[] parts = row.split(",");
            System.out.println("Name:" + parts[0]);
            System.out.println("Age:" + parts[1]);
            System.out.println("Id:" + parts[2]);
            System.out.println("Email:" + parts[3]);
            System.out.println(Arrays.toString(parts));

        }
    } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
    }
}}
