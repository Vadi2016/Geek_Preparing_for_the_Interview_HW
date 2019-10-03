package com.hibernate;

import com.hibernate.dao.StudentDAO;
import com.hibernate.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import static com.hibernate.HibernateConfig.getSessionFactory;

public class HibernatePlayground {

    final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    final java.util.Random rand = new java.util.Random();

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= 1000; i++) {
            while(builder.toString().length() == 0) {

            }
//            studentDAO.createNewStudent();
        }
    }
}
