package ru.belova.java;

public class Person {
    String name;
    String department;
    Sex sex;

    public Person(String name, String department, Sex sex) {
        this.name = name;
        this.department = department;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void print() {
        System.out.println(this);
    }

    public static void printAll(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            persons[i].print();
        }
    }
}


