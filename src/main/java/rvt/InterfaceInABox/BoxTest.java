package rvt.InterfaceInABox;

public class BoxTest {
    public static void main(String[] args) {
        Box.Book book = new Box.Book();

        book.book("The Great Gatsby", "F. Scott Fitzgerald", 0.5);
        
        System.out.println("-----------------------------");

        Box.CD cd = new Box.CD();

        cd.cd("The Beatles", "Abbey Road", 1969);
    }
    
}
