import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Exercise11 {
    public static void main(String[] args) {

        //Write a Java program to create a class called "Library"
        // with a collection of books and methods to add and remove books.
        System.out.println(Library.getCollection());
        Library.addBooks("Physics");
        System.out.println(Library.getCollection());
       Library.addBooks("RAma Kan");
        System.out.println(Library.getCollection());
    }
}



class Library{

    private static ArrayList<String> collection=new ArrayList<>();

    public static ArrayList<String> getCollection() {
        return collection;
    }

    public static void setCollection(ArrayList<String> collection) {
        collection.addAll(collection);
    }

    public static void addBooks(String book){
        collection.add(book);
    }
    public static void removeBook(String book) {
        collection.remove(book);
    }

}

