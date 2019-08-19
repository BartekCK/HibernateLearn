package com.telusko;

import javax.persistence.*;

@Entity
@Table(name = "LAPTOP")
public class Laptop {

    @Id
    private int id;
    private String type;

    @ManyToOne(fetch = FetchType.EAGER)
    private Student studentId;

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

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", type='" + type + '\'' ;
    }
}
