package com.geek.springcloud.cloud.client.services;

import com.geek.springcloud.cloud.client.entities.Student;
import com.geek.springcloud.cloud.client.entities.StudentDTO;

import java.util.List;

public interface StudentService {

    List<StudentDTO> getAllStudents();
    StudentDTO insertStudent(StudentDTO student);
    void deleteStudent(Long id);
}
