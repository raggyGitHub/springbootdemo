package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ronald =new Student(

                    "Ronald",
                    "ronisarmont@gmail.com",
                    LocalDate.of(1984, Month.AUGUST,5),
                    38
            );
            Student malkova =new Student(

                    "Malkova Mia",
                    "fuckova@gmail.com",
                    LocalDate.of(1995, Month.APRIL,15),
                    26
            );
            repository.saveAll(
                 List.of(ronald,malkova)
            );
        };
    }
}
