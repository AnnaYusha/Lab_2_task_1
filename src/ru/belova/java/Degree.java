package ru.belova.java;

public enum Degree {
    PHD("PhD"),
    MSC("MSc");

    private Degree(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
