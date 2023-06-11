package com.example.edhomework.api;

import com.example.edhomework.models.Students;
import com.example.edhomework.service.impl.BaseStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final BaseStudentService studentService;

    @GetMapping("/{id}")
    public Students getStudentById(@PathVariable Integer id) {
        return studentService.getById(id);
    }

    @GetMapping("/all")
    public List<Students> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/create")
    public void createStudent(@RequestBody Students students) {
        studentService.createStudent(students);
    }

    @PutMapping("/{id}")
    public void updateStudent(@RequestBody Students students, @PathVariable Integer id) {
        studentService.updateById(students, id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleteById(id);
    }

}
