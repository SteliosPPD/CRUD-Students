/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crud.student.StudentService;

import com.mycompany.crud.student.StudentDao.StudentDao;
import com.mycompany.crud.student.entities.Student;
import java.util.List;

/**
 *
 * @author stpap
 */
public class StudentService {
    
    StudentDao tDao = new StudentDao();
    
    public List<Student> getTrainers(){
        List<Student> students = tDao.getAllStudents();
        return students;
    }
    
}
