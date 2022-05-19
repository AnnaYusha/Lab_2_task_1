package ru.belova.java;

public class Aspirant extends Person {
    String dissertationTheme;

    public Aspirant(String name, String department, Sex sex,  String dissertationTheme) {
        super(name, department, sex);
        this.dissertationTheme = dissertationTheme;

    }

    public String getDissertationTheme() {
        return dissertationTheme;
    }

    public void setDissertationTheme(String dissertationTheme) {
        this.dissertationTheme = dissertationTheme;
    }

    @Override
    public String toString() {
        return name + "." +
                (sex == Sex.MALE ? " He studies at " + department + ". His thesis title is " + dissertationTheme + "." : (" She studies at " + department + ". Her thesis title is " + dissertationTheme + "."));

    }


}
