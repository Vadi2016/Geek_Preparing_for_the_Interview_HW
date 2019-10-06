package com.geek.springcloud.cloud.client.services;

import com.geek.springcloud.cloud.client.entities.Student;
import com.geek.springcloud.cloud.client.entities.StudentDTO;
import com.geek.springcloud.cloud.client.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAllBy();
    }

    @Override
    public StudentDTO insertStudent(StudentDTO student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        studentRepository.delete(student);
    }
}
