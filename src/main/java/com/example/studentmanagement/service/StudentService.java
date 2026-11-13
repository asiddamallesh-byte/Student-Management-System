
package com.example.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;
import com.example.studentmanagement.model.Student;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(String id) {
        return studentRepository.findById(id);
    }

    public Optional<Student> updateStudent(String id, Student updatedStudent) {
        Optional<Student> existingStudent = studentRepository.findById(id);

        if (existingStudent.isPresent()) {
            Student student = existingStudent.get();

            student.setName(updatedStudent.getName());
            student.setAge(updatedStudent.getAge());
            student.setEmail(updatedStudent.getEmail());

            Student savedStudent = studentRepository.save(student);
            return Optional.of(savedStudent);
        }

        return Optional.empty();
    }

    public boolean deleteStudent(String id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
