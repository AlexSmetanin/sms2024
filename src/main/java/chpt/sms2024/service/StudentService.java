package chpt.sms2024.service;

import chpt.sms2024.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudets();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
