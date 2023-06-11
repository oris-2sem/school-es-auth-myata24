package com.example.edhomework.service.impl;

import com.example.edhomework.exception.NotFound;
import com.example.edhomework.models.Teacher;
import com.example.edhomework.repository.TeacherRepository;
import com.example.edhomework.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BaseTeacherService implements TeacherService {

    private final TeacherRepository teacherRepository;

    @Override
    public void createTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteById(Integer id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public void updateById(Teacher teacher, Integer id) {
        Teacher teacher1 = teacherRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
        teacher1.setName(teacher.getName());
        teacher1.setSurname(teacher.getSurname());
        teacher1.setProfile(teacher.getProfile());
        teacherRepository.save(teacher1);
    }

    @Override
    public Teacher getById(Integer id) {
        return teacherRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
    }

    @Override
    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }
}
