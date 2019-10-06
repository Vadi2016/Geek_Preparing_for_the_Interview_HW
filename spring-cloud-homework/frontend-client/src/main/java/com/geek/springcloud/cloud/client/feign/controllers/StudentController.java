package com.geek.springcloud.cloud.client.feign.controllers;

import com.geek.springcloud.cloud.client.entities.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    private StudentClient studentClient;

    @Autowired
    public void setStudentClient(StudentClient studentClient) {
        this.studentClient = studentClient;
    }

    @GetMapping("")
    public String getAllStudents(Model model) {
        List<StudentDTO> students = studentClient.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

    @PostMapping("/new")
    public String insertStudent(Model model, @ModelAttribute(name = "student") StudentDTO student) {
        studentClient.createNewStudent(student);
        return "students";
    }

    @GetMapping("/new")
    public String addStudent(@ModelAttribute(name = "student") StudentDTO student) {
        return "addStudent";
    }

    @RequestMapping("/remove/{id}")
    public String addStudent(@PathVariable("id") Long id) {
        studentClient.deleteStudent(id);
        return "students";
    }
}
