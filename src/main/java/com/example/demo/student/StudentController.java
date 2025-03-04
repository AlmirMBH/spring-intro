package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService; // this.studentService = new StudentService();
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

//    @GetMapping(value = "/students")
//    public String getStudents(Model model){
//        List<Student> student = studentService.getStudents();
//        model.addAttribute("students", student);
//        return "index";
//    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){ studentService.addNewStudent(student); }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){ studentService.deleteStudent(studentId); }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
                @PathVariable("studentId") Long studentId,
                @RequestParam(required = false) String name,
                @RequestParam(required = false) String email
            ){
        studentService.updateStudent(studentId, name, email);
    }
}
