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
                    LocalDate.of(1984, Month.AUGUST,5)

            );
            Student carito =new Student(

                    "Carito My",
                    "car_um@gmail.com",
                    LocalDate.of(1985, Month.APRIL,27)

            );
            Student carla =new Student(

                    "Carla U",
                    "car@gmail.com",
                    LocalDate.of(1981, Month.JANUARY,31)

            );
            Student ariana =new Student(

                    "Ari Mia",
                    "are@gmail.com",
                    LocalDate.of(2008, Month.DECEMBER,3)

            );
            repository.saveAll(
                 List.of(ronald,carito,carla,ariana)
            );
        };
    }
}
