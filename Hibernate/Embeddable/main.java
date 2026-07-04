package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Laptop l1=new Laptop();
        l1.setBrand("acer");
        l1.setRam(34);
        l1.setColor("black");

        Alian a1=new Alian();
        a1.setAid(1);
        a1.setAname("iri");
        a1.setTech("java");
        a1.setLaptop(l1);

//        Configuration cfg=new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();
        SessionFactory sf= new Configuration().addAnnotatedClass(org.example.Alian.class).configure().buildSessionFactory();      //cfg.buildSessionFactory();  refactoring
        Session session= sf.openSession();
        Transaction transaction= session.beginTransaction();

        session.persist(a1);
        transaction.commit();
        session.close();
        sf.close();
        System.out.println(a1);

    }
}
