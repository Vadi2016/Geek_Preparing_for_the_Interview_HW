package com.geek.springcloud.cloud.client.controllers;

import com.geek.springcloud.cloud.client.entities.Student;
import com.geek.springcloud.cloud.client.entities.StudentDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface StudentController {
    @RequestMapping("/students")
    List<StudentDTO> getAllStudents();

    @PostMapping("/students")
    StudentDTO createNewStudent(@RequestBody StudentDTO newStudent);

    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable("id") Long id);
}
