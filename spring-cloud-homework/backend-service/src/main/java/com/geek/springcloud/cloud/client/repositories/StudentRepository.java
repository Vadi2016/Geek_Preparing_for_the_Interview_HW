package com.geek.springcloud.cloud.client.repositories;

import com.geek.springcloud.cloud.client.entities.Student;
import com.geek.springcloud.cloud.client.entities.StudentDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<StudentDTO> findAllBy();
    StudentDTO save(StudentDTO studentDTO);
}
