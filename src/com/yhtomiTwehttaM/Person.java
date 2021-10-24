package com.yhtomiTwehttaM;

public class Person {
    private final String firstname;
    private final String lastname;
    private final int number;
    private final boolean isPriority;

    public Person(String firstname, String lastname, boolean isPriority, int number) {
        this.firstname = setName(firstname);
        this.lastname = setName(lastname);
        this.isPriority = isPriority;
        this.number = number;
    }

    public String getLastname() {
        return lastname;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public String getFirstname() {
        return firstname;
    }

    private String setName(String name) {
        if (name.isEmpty()) {
            name = "\"N/A\"";
        }
        return StringFormatter.capitalizeWord(name);
    }

    public int getNumber() {
        return number;
    }
}
