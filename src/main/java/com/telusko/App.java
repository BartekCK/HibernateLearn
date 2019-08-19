package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        Alien telusko = new Alien();

        telusko.setAid(1);
        telusko.setAname("Michal");
        telusko.setColor("Black");


        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        session.save(telusko);
        tx.commit();

    }
}
