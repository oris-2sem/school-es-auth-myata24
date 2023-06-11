package com.example.edhomework.api;


import com.example.edhomework.models.Class;
import com.example.edhomework.service.impl.BaseClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/class")
public class ClassController {

    private final BaseClassService classService;

    @GetMapping("/{id}")
    public Class getClassById(@PathVariable Integer id) {
        return classService.getById(id);
    }

    @GetMapping("/all")
    public List<Class> getClasses() {
        return classService.getClasses();
    }

    @PostMapping("/create")
    public void createClass(@RequestBody Class clazz) {
        classService.createClass(clazz);
    }

    @PutMapping("/{id}")
    public void updateClass(@RequestBody Class clazz, @PathVariable Integer id) {
        classService.updateById(clazz, id);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Integer id) {
        classService.deleteById(id);
    }

}
