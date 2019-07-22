package com.mycompany.crud.student.StudentDao;

import com.mycompany.crud.student.Util.HibernateUtil;
import com.mycompany.crud.student.entities.Student;
import java.util.List;
import org.hibernate.Session;

public class StudentDao {
    
    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<Student> students = (List<Student>) session.createQuery(
                "FROM Student s ORDER BY s.firstName ASC").list();

        session.getTransaction().commit();
        session.close();
        return students;
    }
    
}
