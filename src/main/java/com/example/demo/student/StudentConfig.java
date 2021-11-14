package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student john = new Student(
                    "John",
                    "john@john.ba",
                    LocalDate.of(2000, JANUARY, 5)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@alex.ba",
                    LocalDate.of(1995, SEPTEMBER, 14)
            );

            repository.saveAll(
                    List.of(john, alex)
                    );
        };
    }
}
