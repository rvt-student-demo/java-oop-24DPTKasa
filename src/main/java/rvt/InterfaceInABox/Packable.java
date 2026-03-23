package rvt.InterfaceInABox;

public interface Packable {
    public class Book{
        public void book(String name, String author, double weight){
            System.out.println("Book name: " + name);
            System.out.println("Author: " + author);
            System.out.println("Weight: " + weight + " kg");    

        }

    }
    public class CD{
        private void cd(String artist, String CDname, int publicationYear, double weight){
            System.out.println("Artist: " + artist);
            System.out.println("CD name: " + CDname);
            System.out.println("Publication year: " + publicationYear);
            System.out.println("Weight: " + weight + " kg");
        }

        public void cd(String artist, String CDname, int publicationYear){
            cd(artist, CDname, publicationYear, 0.1);
        }
    }
}
