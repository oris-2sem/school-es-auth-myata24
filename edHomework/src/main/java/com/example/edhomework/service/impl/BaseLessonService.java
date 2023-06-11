package com.example.edhomework.service.impl;

import com.example.edhomework.exception.NotFound;
import com.example.edhomework.models.Lesson;
import com.example.edhomework.repository.LessonRepository;
import com.example.edhomework.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BaseLessonService implements LessonService {

    private final LessonRepository lessonRepository;

    @Override
    public void createLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    @Override
    public void deleteById(Integer id) {
        lessonRepository.deleteById(id);
    }

    @Override
    public void updateById(Lesson lesson, Integer id) {
        Lesson lesson1 = lessonRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
        lesson1.setId(lesson.getId());
        lesson1.setSubject(lesson.getSubject());
        lesson1.setTheme(lesson.getTheme());
        lesson1.setTimetable(lesson.getTimetable());
        lessonRepository.save(lesson1);
    }


    @Override
    public Lesson getById(Integer id) {
        return lessonRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
    }

    @Override
    public List<Lesson> getLessons() {
        return lessonRepository.findAll();
    }
}
