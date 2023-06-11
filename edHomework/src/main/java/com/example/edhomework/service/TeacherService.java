package com.example.edhomework.service;

import com.example.edhomework.models.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {

    void createTeacher(Teacher teacher);

    void deleteById(Integer id);

    void updateById(Teacher teacher, Integer id);

    Teacher getById(Integer id);

    List<Teacher> getTeachers();

}
