package com.telusko;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "LAPTOP")
public class Laptop {

    @Id
    private int id;
    private String type;

    @ManyToMany
    private List<Student> student = new ArrayList<Student>();

    public Laptop() {
    }

    public Laptop(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", type='" + type + '\'' ;
    }
}
