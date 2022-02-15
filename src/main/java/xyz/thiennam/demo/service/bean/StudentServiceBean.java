package xyz.thiennam.demo.service.bean;

import org.springframework.stereotype.Service;
import xyz.thiennam.demo.entity.Student;
import xyz.thiennam.demo.repository.StudentRepo;
import xyz.thiennam.demo.service.StudentService;

import java.util.List;

@Service
public class StudentServiceBean implements StudentService {

    private final StudentRepo studentRepo;

    public StudentServiceBean(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> findAllOrderByCode() {
        return studentRepo.findAllByOrderByCode();
    }

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }
}
