package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {


    public static void main(String[] args) {
        Student student = new Student(1,"Bartek");
        Laptop laptop1 = new Laptop(1,"Dell");
        Laptop laptop2 = new Laptop(2,"MAC");

        laptop1.setStudentId(student);
        laptop2.setStudentId(student);

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(student);
        session.save(laptop1);
        session.save(laptop2);

        tx.commit();
        session.close();

//------------------------------------------------------------------

        session = sessionFactory.openSession();
        Student test=session.get(Student.class,1);
        System.out.println(test.getLaptop().get(0));

        session.close();


    }




}
