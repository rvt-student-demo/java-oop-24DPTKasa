package rvt;
import java.nio.file.Paths;
import java.util.Scanner;

public class order {
    //download extencion rainbow csv
    try (Scanner scanner = new Scanner(Paths.get("data/orders.csv"))){
        

    } catch (Exception e) {
    System.out.println("Error" + e.getMessage());
}

} 
