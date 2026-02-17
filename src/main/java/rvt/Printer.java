package rvt;

public class Printer {
    public static void main(String[] args) {
        String[] data = {"John", "Doe", "DoeJ@gmail.com", "123214512"};
        Printer printer = new Printer();
        printer.printCLITable(data);
    }
    
    public void printCLITable(String[] data){
        String vards = "Vards";
        String uzvards = "Uzvards";
        String email = "E-pasts";
        String id = "personal kods";
        

        System.out.printf("+-----------------+-----------------+-----------------+-----------------+%n");
        System.out.printf("|  %-15s| %-15s | %-15s | %-15s |%n", vards, uzvards, email,id  );
        System.out.printf("+-----------------+-----------------+-----------------+-----------------+%n");
        System.out.printf("| %-15s | %-15s | %-15s | %-15s |%n", data[0], data[1], data[2], data[3]);
    }
}
