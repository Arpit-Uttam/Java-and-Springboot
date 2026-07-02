package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // Student s1=new Student();
        // s1.setRollNo(4);
        // s1.setsName("Ravi");
        // s1.setsAge(69);
//        Configuration cfg=new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();
        Student s2=null;
        SessionFactory sf= new Configuration().addAnnotatedClass(org.example.Student.class).configure().buildSessionFactory();      //cfg.buildSessionFactory();  refactoring
        Session session= sf.openSession();
        s2=session.find(Student.class, 2);

        session.close();
        sf.close();
        System.out.println(s2);

    }
}
