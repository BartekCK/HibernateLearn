package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Alien alien = new Alien();
        AlienName alienName = new AlienName();
        alienName.setFname("a");
        alienName.setLname("b");
        alienName.setMname("c");

        alien.setAid(1);
        alien.setColor("Green");
        alien.setAname(alienName);

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(alien);
        tx.commit();

        session.close();

        //session.save(telusko);
       // tx.commit();

    }
}
