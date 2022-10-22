package application;

import metier.Adherent;
import metier.Person;
import metier.Author;
import metier.Book;

public class Main {
    public static void main(String[] args) {
    // Polymorhisme
        Person p1 = new Adherent("HAMZA","BRAIMI","hamza.braimi33@gmail.com","0696792627",21,1);
        Person p2 = new Author("ZAKARIA","BRAIMI","ZAKARIA.braimi33@gmail.com","0696792627",31,2);

        p1.display();
        p2.display();

        Book b1= new Book(12,"Rich Dad Poor Dad",(Author)p2);
        b1.display();


    }
}