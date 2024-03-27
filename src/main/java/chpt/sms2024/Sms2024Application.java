package chpt.sms2024;

import chpt.sms2024.entity.Student;
import chpt.sms2024.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sms2024Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Sms2024Application.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3 = new Student("Tony", "Stark", "tony@gmail.com");
//        studentRepository.save(student3);
    }
}