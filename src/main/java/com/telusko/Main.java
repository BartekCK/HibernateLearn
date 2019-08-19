package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {


    public static void main(String[] args) {
        Student student1 = new Student(1,"Bartek");
        Student student2 = new Student(2,"Kacper");
        Laptop laptop1 = new Laptop(1,"Dell");
        Laptop laptop2 = new Laptop(2,"MAC");

        laptop1.getStudent().add(student1);
        laptop1.getStudent().add(student2);

        laptop2.getStudent().add(student1);
        laptop2.getStudent().add(student2);

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(student1);
        session.save(student2);
        session.save(laptop1);
        session.save(laptop2);

        tx.commit();
        session.close();

    }




}
