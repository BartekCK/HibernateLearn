package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        Alien telusko = session.get(Alien.class,2);
        System.out.println(telusko);
        session.close();

        //session.save(telusko);
       // tx.commit();

    }
}
