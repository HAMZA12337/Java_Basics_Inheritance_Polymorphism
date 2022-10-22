package metier;

public class Engineer extends Employe {

    private String speciality;

    public Engineer(String firstName, String lastName, String phone, double salary, String speciality) {
        super(firstName, lastName, phone, salary);
        this.speciality = speciality;
    }

    public double calculateSalary(){


    return 1.15*this.getSalary();
    }


    @Override
    public String toString() {
        return "Engineer{" +
                "speciality='" + speciality + '\'' +
                 " Salary ='" + this.calculateSalary() + '\'' +
                  super.toString()
                ;
    }
}
