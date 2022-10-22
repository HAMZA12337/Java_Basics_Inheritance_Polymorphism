package metier;

public class Adherent extends Person {

    private int numAdherent ;



    // constructor


    public Adherent(String firstName, String lastName, String email, String tel, int age, int numAdherent) {
        super(firstName, lastName, email, tel, age);
        this.numAdherent = numAdherent;
    }

    // display method


    @Override
    public void display() {
        System.out.println("----------------------- Adherent Information--------------");
       super.display();
        System.out.println(" number of Adherent:"+numAdherent);
    }

}
