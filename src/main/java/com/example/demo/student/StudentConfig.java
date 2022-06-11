package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student tim = new Student(
                    1L,
                    "tim",
                    LocalDate.of(1999,1,19),
                    "tuto140@gmail.com"
            );

            Student alex = new Student(
                    2L,
                    "alex",
                    LocalDate.of(2001,1,9),
                    "tuto140@gmail.com"
            );

            Student john = new Student(
                    3L,
                    "john",
                    LocalDate.of(2011,1,11),
                    "tuto140@gmail.com"
            );

            Student ivan = new Student(
                    4L,
                    "ivan",
                    LocalDate.of(2021,1,1),
                    "tuto140@gmail.com"
            );

            repository.saveAll(
                    List.of(tim,alex,john,ivan)
            );
        };
    }

}
