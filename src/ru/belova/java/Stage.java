package ru.belova.java;

public enum Stage {
    BACHELOR ("Bachelor"),
    MASTER ("Master");

    private Stage( String stage){
        this.value = value;
    }
    public String value;

    public String getValue() {
        return value;
    }
}
