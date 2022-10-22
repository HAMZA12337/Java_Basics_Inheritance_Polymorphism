package metier;

public class Book {

    private int isbn;
    private Author author ;
    private String title;
// Constructor


    public Book(int isbn, String title,Author author) {
        this.isbn = isbn;
        this.author = author;
        this.title=title;
    }

    // display method

    public void display(){
        System.out.println("----------------------- Book  Information--------------");
        System.out.println(" title:"+title);
        System.out.println(" isbn :"+isbn);
        author.display();

    }



}
