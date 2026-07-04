package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    static void main() {
        Laptop l1=new Laptop();
        l1.setLid(1);
        l1.setBrand("acer");
        l1.setRam(34);

        Laptop l2=new Laptop();
        l2.setLid(2);
        l2.setBrand("dell");
        l2.setRam(30);

        Alian a1=new Alian();
        a1.setAid(1);
        a1.setAname("iri");
        a1.setTech("java");
        a1.setLaptops(Arrays.asList(l1,l2));

        SessionFactory sf= new Configuration().addAnnotatedClass(org.example.Alian.class).addAnnotatedClass(org.example.Laptop.class).configure().buildSessionFactory();      //cfg.buildSessionFactory();  refactoring
        Session session= sf.openSession();
        Transaction transaction= session.beginTransaction();

        session.persist(a1);
        session.persist(l1);
        session.persist(l2);

        transaction.commit();
        session.close();
        sf.close();
        System.out.println(a1);

    }
}
