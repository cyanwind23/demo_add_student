package xyz.thiennam.demo.service;

import xyz.thiennam.demo.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllOrderByCode();
    Student save(Student student);
}
