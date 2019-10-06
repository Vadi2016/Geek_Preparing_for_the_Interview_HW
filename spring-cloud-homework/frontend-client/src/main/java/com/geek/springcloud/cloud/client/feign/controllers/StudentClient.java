package com.geek.springcloud.cloud.client.feign.controllers;

import com.geek.springcloud.cloud.client.entities.Student;
import com.geek.springcloud.cloud.client.entities.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("backend-service")
public interface StudentClient {
    @RequestMapping("/students")
    List<StudentDTO> getAllStudents();

    @PostMapping("/students")
    StudentDTO createNewStudent(@RequestBody StudentDTO newStudent);

    @DeleteMapping("students/{id}")
    void deleteStudent(@PathVariable("id") Long id);
}
