package org.example.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Navin", "Java"),
            new Student(2, "Kiran", "Blockchain")
    ));

    @GetMapping("students")
    public List<Student> getStudents(){
        return students;
    }
}
