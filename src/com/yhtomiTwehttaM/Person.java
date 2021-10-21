package com.yhtomiTwehttaM;

public class Person {
    private String firstname;
    private String lastname;
    private final int number;
    private boolean isPriority;

    public Person() {
        this.firstname = "";
        this.lastname = "";
        this.number = 0;
        this.isPriority = false;
    }

    public Person(String firstname, String lastname, boolean isPriority, int number) {
        this.firstname = setName(firstname);
        this.lastname = setName(lastname);
        this.isPriority = isPriority;
        this.number = number;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = setName(lastname);
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = setName(firstname);
    }

    private String setName(String name) {
        if (name.isEmpty())
            name = "\"N/A\"";
        return StringFormatter.capitalizeWord(name);
    }

    public int getNumber() {
        return number;
    }
}
