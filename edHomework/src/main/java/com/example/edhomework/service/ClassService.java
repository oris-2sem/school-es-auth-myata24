package com.example.edhomework.service;

import com.example.edhomework.models.Class;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassService {

    void createClass(Class clazz);

    void deleteById(Integer id);

    void updateById(Class clazz, Integer id);

    Class getById(Integer id);

    List<Class> getClasses();

}
