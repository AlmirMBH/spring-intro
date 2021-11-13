package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//@Component
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

//     Code below not needed when StudentRepository used
//        @GetMapping
//        public List<Student> getStudents(){
//            return List.of(
//                    new Student(
//                            1L,
//                            "Almir",
//                            "almir@almir.ba",
//                            LocalDate.of(1979, Month.DECEMBER, 4),
//                            41
//                    )
//            );
//        }
}
