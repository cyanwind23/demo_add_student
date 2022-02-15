package xyz.thiennam.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import xyz.thiennam.demo.entity.Student;
import xyz.thiennam.demo.service.StudentService;

@Controller
public class HomeController {

    private final StudentService studentService;

    public HomeController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String index(Model model) {
        Student studentDto = new Student();
        studentDto.setGender(true); // default male
        model.addAttribute("studentDto", studentDto);
        model.addAttribute("students", studentService.findAllOrderByCode());

        return "index";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute("studentDto") Student student) {
        studentService.save(student);
        return "redirect:/";
    }
}
