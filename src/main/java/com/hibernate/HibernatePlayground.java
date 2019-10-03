package com.hibernate;

import com.hibernate.dao.StudentDAO;
import com.hibernate.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import static com.hibernate.HibernateConfig.getSessionFactory;

public class HibernatePlayground {

    final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final static java.util.Random rand = new java.util.Random();

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();

        for (int i = 0; i <= 1000; i++) {
            Student student = new Student("Ivan" + i, rand.nextInt((5 - 1) + 1) + 1);
            studentDAO.createNewStudent(student);
        }


    }


}
