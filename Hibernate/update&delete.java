package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Student s1=new Student();
        // s1.setRollNo(6);
        // s1.setsName("Chaurasiya");
        // s1.setsAge(30);
//        Configuration cfg=new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();
        SessionFactory sf= new Configuration().addAnnotatedClass(org.example.Student.class).configure().buildSessionFactory();      //cfg.buildSessionFactory();  refactoring
        Session session= sf.openSession();
        s1=session.find(Student.class, 2);
        Transaction transaction= session.beginTransaction();

        //session.merge(s1);               //this is to save and update if the object exists, update if not create
        session.remove(s1);                 //it deletes object 

        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);

    }
}
