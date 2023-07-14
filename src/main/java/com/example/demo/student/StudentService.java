package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Ronald",
                        "ronisarmont@gamil.com",
                        LocalDate.of(1984, Month.AUGUST,5),
                        38

                )
        );
    }
}
