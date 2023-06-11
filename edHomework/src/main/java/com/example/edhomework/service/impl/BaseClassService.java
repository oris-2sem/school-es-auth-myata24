package com.example.edhomework.service.impl;

import com.example.edhomework.exception.NotFound;
import com.example.edhomework.models.Class;
import com.example.edhomework.repository.ClassRepository;
import com.example.edhomework.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BaseClassService implements ClassService {

    private final ClassRepository classRepository;

    @Override
    public void createClass(Class clazz) {
        classRepository.save(clazz);
    }

    @Override
    public void deleteById(Integer id) {
        classRepository.deleteById(id);
    }

    @Override
    public void updateById(Class clazz, Integer id) {
        Class class1 = classRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
        class1.setId(clazz.getId());
        class1.setTeacher(clazz.getTeacher());
        classRepository.save(class1);
    }

    @Override
    public Class getById(Integer id) {
        return classRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
    }

    @Override
    public List<Class> getClasses() {
        return classRepository.findAll();
    }
}
