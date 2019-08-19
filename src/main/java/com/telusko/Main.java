package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {


    public static void main(String[] args) {
        Student student = new Student(1,"Bartek");
        Laptop laptop = new Laptop(1,"Dell");

        student.setLaptop(laptop);

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(laptop);
        session.save(student);

        tx.commit();
        session.close();

    }




}
