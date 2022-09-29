package org.launchcode.techjobs.oo;

public abstract class JobField {
    //Fields
    int id;
    static int nextId = 1;
    String value;

    //Constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField (String value) {
        this();
        this.value = value;
    }

    //Getters and Setters
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    //toString Method
    public String toString() {
        return value;
    }
}
