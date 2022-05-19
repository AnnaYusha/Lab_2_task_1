package ru.belova.java;

public class Student extends Person {
    Stage stage;
    String course;

    public Student(String name, Sex sex, String department, Stage stage, String course) {
        super(name, department, sex);
        this.stage = stage;
        this.course = course;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return name + "." +
                (sex == Sex.MALE ? " He studies at " + department + ". He is " + course + "'th year " + stage.getValue() + " student." :
                        (" She studies at " + department + " She is " + course + "'th year " + stage.getValue() + " student."));
    }

}
