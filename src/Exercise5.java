import java.util.ArrayList;

public class Exercise5 {
    public static void main(String[] args) {
        //Write a Java program to create a class called "Book"
        // with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
        Book book1=new Book("Javascript","Ramesh Gupta","456789");
        Book book2=new Book("Framework of CSS","john malton","35636790");
        Book.add_Book(book1);
        Book.add_Book(book2);
        ArrayList < Book > bookCollection =Book.get_collection();
        for (Book book:bookCollection) {

            System.out.println(book.getTitle()+" by "+book.getAuthor_name()+ " and "+book.getISBN());

        }

        Book.remove_book(book1);
        for (Book book:bookCollection) {

            System.out.println(book.getTitle()+" by "+book.getAuthor_name()+ " and "+book.getISBN());

        }


    }
}
class Book{

    private String title;
    private String author_name;
    private String ISBN;
    private static ArrayList<Book> bookCollection = new ArrayList < Book > ();

    Book(String title,String author_name,String ISBN){
        this.title=title;
        this.author_name=author_name;
        this.ISBN=ISBN;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public static void add_Book(Book book){
        bookCollection.add(book);
    }
    public static void remove_book(Book book){
        bookCollection.remove(book);
    }

    public static ArrayList<Book> get_collection(){

        return  bookCollection;

    }


}