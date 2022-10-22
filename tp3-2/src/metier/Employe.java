package metier;

public abstract  class Employe {

    private String firstName;
    private String lastName;
    private String phone;
    private double salary ;



    // default constructor

    public Employe() {

    }
    // Constructor with parameters
    public Employe(String firstName, String lastName, String phone, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.salary = salary;
    }

    public abstract  double calculateSalary() ;

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employe{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +

                '}';
    }
}
