package com.telusko;

import javax.persistence.*;

@Entity
@Table(name = "ALIEN_TABLE")
public class Alien {

    @Id
    private int aid;
    @Transient
    private String aname;
    @Column(name = "ALIEN_COLOR")
    private String color;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
