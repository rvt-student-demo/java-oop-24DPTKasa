package rvt.InterfaceInABox;

public class BoxTest {
    public static void main(String[] args) {
        Packable.Book book = new Packable.Book();

        book.book("The Great Gatsby", "F. Scott Fitzgerald", 0.5);
        
        System.out.println("-----------------------------");

        Packable.CD cd = new Packable.CD();

        cd.cd("The Beatles", "Abbey Road", 1969);
    }
    
}
