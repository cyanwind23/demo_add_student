package xyz.thiennam.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.thiennam.demo.entity.Student;

import java.util.List;
import java.util.UUID;

public interface StudentRepo extends JpaRepository<Student, UUID> {
    List<Student> findAllByOrderByCode();
}
