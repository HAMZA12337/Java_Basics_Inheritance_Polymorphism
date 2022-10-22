package metier;

public class Author extends Person {

    private int numAuthor ;



    // constructor


    public Author(String firstName, String lastName, String email, String tel, int age, int numAuthor) {
        super(firstName, lastName, email, tel, age);
        this.numAuthor = numAuthor;
    }

    // display method


    @Override
    public void display() {
        System.out.println("----------------------- Author Information--------------");
        super.display();
        System.out.println(" number of Author :"+numAuthor);
    }
}
