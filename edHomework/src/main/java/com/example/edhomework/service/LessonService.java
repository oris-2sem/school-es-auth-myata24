package com.example.edhomework.service;

import com.example.edhomework.models.Lesson;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LessonService {

    void createLesson(Lesson lesson);

    void deleteById(Integer id);

    void updateById(Lesson lesson, Integer id);

    Lesson getById(Integer id);

    List<Lesson> getLessons();
}
