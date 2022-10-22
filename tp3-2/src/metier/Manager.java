package metier;

public class Manager extends Employe{

    private String service ;

    public Manager(String service) {
        this.service = service;
    }

    public Manager(String firstName, String lastName, String phone, double salary, String service) {
        super(firstName, lastName, phone, salary);
        this.service = service;
    }

    public double calculateSalary(){


        return 1.2*this.getSalary();}







}
