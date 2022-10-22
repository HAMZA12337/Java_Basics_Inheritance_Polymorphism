package application;

import metier.Employe;
import metier.Engineer;
import metier .Manager;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Engineer e1 = new Engineer("HAMZA","BRAIMI","0696792627",1234,"Data Science");
        System.out.println("---------------- Engineer Salary-----------------------");
        System.out.println(e1.calculateSalary());
        Manager e2 = new Manager("HAYTAM","BRAIMI","0696792627",1234,"IT MANAGER");
        System.out.println("---------------- Manager Salary-----------------------");
        System.out.println(e2.calculateSalary());

System.out.println("--------------------- The whole information about actors--------------------------------");
        System.out.println(e1);
        System.out.println(e2);

    }
}