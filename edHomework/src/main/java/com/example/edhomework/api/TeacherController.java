package com.example.edhomework.api;

import com.example.edhomework.models.Teacher;
import com.example.edhomework.service.impl.BaseTeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final BaseTeacherService teacherService;

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable Integer id) {
        return teacherService.getById(id);
    }

    @GetMapping("/all")
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }

    @PostMapping("/create")
    public void createTeacher(@RequestBody Teacher teacher) {
        teacherService.createTeacher(teacher);
    }

    @PutMapping("/{id}")
    public void updateClass(@RequestBody Teacher teacher, @PathVariable Integer id) {
        teacherService.updateById(teacher, id);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Integer id) {
        teacherService.deleteById(id);
    }

}
