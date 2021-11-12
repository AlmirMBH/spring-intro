package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
//@RestController -> moved to the StudentController
public class DemoApplication {

	public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

    }

//	@GetMapping
//	public String greeting(){
//		return "Hello world!";
//	}

    // prints a json list
//    public List<String> greeting(){
//        return List.of("Hello",  "World!");
//    }





}
