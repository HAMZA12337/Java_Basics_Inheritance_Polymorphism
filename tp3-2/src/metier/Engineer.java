package metier;

public class Engineer extends Employe {

    private String speciality;

    public Engineer(String firstName, String lastName, String phone, double salary, String speciality) {
        super(firstName, lastName, phone, salary);
        this.speciality = speciality;
    }

    public double calculateSalary(){


    return 1.15*this.getSalary();}








}
