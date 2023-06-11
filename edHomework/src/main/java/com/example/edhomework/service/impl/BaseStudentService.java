package com.example.edhomework.service.impl;

import com.example.edhomework.exception.NotFound;
import com.example.edhomework.models.Students;
import com.example.edhomework.repository.StudentRepository;
import com.example.edhomework.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BaseStudentService implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public void createStudent(Students students) {
        studentRepository.save(students);
    }

    @Override
    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void updateById(Students students, Integer id) {
        Students students1 = studentRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
        students1.setClassId(students.getClassId());
        students1.setName(students.getName());
        students1.setParent(students.getParent());
        students1.setSurname(students.getSurname());
        studentRepository.save(students1);
    }

    @Override
    public Students getById(Integer id) {
        return studentRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
    }

    @Override
    public List<Students> getStudents() {
        return studentRepository.findAll();
    }
}
