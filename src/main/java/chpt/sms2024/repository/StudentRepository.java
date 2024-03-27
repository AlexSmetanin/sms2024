package chpt.sms2024.repository;

import chpt.sms2024.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
