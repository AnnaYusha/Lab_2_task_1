package ru.belova.java;

public enum Sex {
    MALE("M"),
    FEMALE("F");

    private Sex(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
