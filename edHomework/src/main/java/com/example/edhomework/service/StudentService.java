package com.example.edhomework.service;

import com.example.edhomework.models.Students;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    void createStudent(Students students);

    void deleteById(Integer id);

    void updateById(Students students, Integer id);

    Students getById(Integer id);

    List<Students> getStudents();

}
