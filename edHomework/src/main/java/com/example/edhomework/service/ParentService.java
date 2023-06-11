package com.example.edhomework.service;

import com.example.edhomework.models.Parent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParentService {

    void createParent(Parent parent);

    void deleteById(Integer id);

    void updateById(Parent parent, Integer id);

    Parent getById(Integer id);

    List<Parent> getParents();

}
