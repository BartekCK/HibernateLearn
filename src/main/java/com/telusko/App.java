package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

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

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(serviceRegistry).addAnnotatedClass(Alien.class).buildMetadata().buildSessionFactory();
        Session session1 = sessionFactory.openSession();
        session1.beginTransaction();

        session1.persist(alien);
        session1.getTransaction().commit();
        session1.close();

    }
}
