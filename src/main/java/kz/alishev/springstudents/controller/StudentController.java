package kz.alishev.springstudents.controller;

import kz.alishev.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import kz.alishev.springstudents.model.Student;

import java.util.List;


@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {


    private final StudentService service;

    @GetMapping("")
    public List<Student> findAllStudents() {
        //todo
        return service.findAllStudents();
    }
    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student) {
        service.saveStudent(student);
        return "Student saved successfully";
    }
    @GetMapping("/{email}")
    public Student findStudentByEmail(@PathVariable String email) {
        return service.findStudentByEmail(email);
    }
    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }
    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
    }
}
