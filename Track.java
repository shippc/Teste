package com.example.javaexemplo;

public class Track {
    private String name;
    private String instructor;

    Track(String name, String instructor){
        this.name = name;
        this.instructor = instructor;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
