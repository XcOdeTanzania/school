package com.qlicue.school.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = List.of(new Student(1L,
                        "Maria",
                        "maria@qlicue.edu",
                        Gender.FEMALE),
                new Student(2L,
                        "Ake",
                        "aleake@qlicue.edu",
                        Gender.MALE));
        return  students;

    }
}
