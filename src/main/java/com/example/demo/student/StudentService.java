package com.example.demo.student;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return Arrays.asList(
                new Student(1L,
                        "Mary",
                        "mary01@gmail.com",
                        LocalDate.of(2000, Month.AUGUST, 5),
                        21
                )
        );
    }
}
