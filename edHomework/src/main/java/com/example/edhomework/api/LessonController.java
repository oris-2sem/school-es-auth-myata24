package com.example.edhomework.api;

import com.example.edhomework.models.Class;
import com.example.edhomework.models.Lesson;
import com.example.edhomework.service.impl.BaseLessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lesson")
@RequiredArgsConstructor
public class LessonController {

    private final BaseLessonService lessonService;

    @GetMapping("/{id}")
    public Lesson getLessonById(@PathVariable Integer id) {
        return lessonService.getById(id);
    }

    @GetMapping("/all")
    public List<Lesson> getLessons() {
        return lessonService.getLessons();
    }

    @PostMapping("/create")
    public void createLesson(@RequestBody Lesson lesson) {
        lessonService.createLesson(lesson);
    }

    @PutMapping("/{id}")
    public void updateLesson(@RequestBody Lesson lesson, @PathVariable Integer id) {
        lessonService.updateById(lesson, id);
    }

    @DeleteMapping("/{id}")
    public void deleteLesson(@PathVariable Integer id) {
        lessonService.deleteById(id);
    }

}
