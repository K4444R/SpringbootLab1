package kz.alishev.springstudents.service.impl;

import kz.alishev.springstudents.model.Student;
import kz.alishev.springstudents.repository.InMemoryStudentDAO;
import kz.alishev.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }


    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
