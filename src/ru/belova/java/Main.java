package ru.belova.java;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[6];
        persons[0] = new Aspirant("Ronald Correa", "Computer science", Sex.MALE, "Design of a functional programming language");
        persons[1] = new Student("Leo Wilkinson",Sex.MALE, "Computer science", Stage.BACHELOR, "III");
        persons[2] = new Student("Anna Cunningham", Sex.FEMALE, "World economy", Stage.BACHELOR, "I");
        persons[3] = new Student("Jull Lundqvist", Sex.FEMALE, "Jurisprudence", Stage.MASTER,  "I");
        persons[4]= new Teacher("Ronald Rurner", Sex.MALE, "Computer science", Degree.PHD,"Programming paradigms");
        persons[5] = new Teacher("Ruth Hollings", Sex.FEMALE, "Jurisprudence", Degree.MSC, "Domestic arbitration");

        Person.printAll(persons);
    }


}