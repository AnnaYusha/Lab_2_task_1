package ru.belova.java;

public class Teacher extends Person {
    Degree degree;
    String speciality;
    public Teacher(String name, Sex sex, String department,Degree degree,String speciality){
        super(name, department, sex);
        this.degree = degree;
        this.speciality =speciality;

    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return name + "." +
                (sex == Sex.MALE ? " He teaches at " + department + ". He has " + degree.getValue() + " degree in speciality " + speciality + "." :
                        (" She teaches at " + department + ". She has " + degree.getValue() + " degree in speciality " + speciality + "."));
    }
}
