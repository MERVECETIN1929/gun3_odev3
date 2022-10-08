package odev3.entities;

public class Course {

    private int id;
    private String name;
    private Instructor ınsInstructor;
    private double price;

    public Course() {

    }

    public Course(int id, String name, Instructor ınsInstructor, double price) {
        this.id = id;
        this.name = name;
        this.ınsInstructor = ınsInstructor;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getInsInstructor() {
        return ınsInstructor;
    }

    public void setInsInstructor(Instructor ınsInstructor) {
        this.ınsInstructor = ınsInstructor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
