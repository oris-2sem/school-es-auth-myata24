package com.example.edhomework.service.impl;

import com.example.edhomework.exception.NotFound;
import com.example.edhomework.models.Parent;
import com.example.edhomework.repository.ParentRepository;
import com.example.edhomework.service.ParentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BaseParentService implements ParentService {

    private final ParentRepository parentRepository;

    @Override
    public void createParent(Parent parent) {
        parentRepository.save(parent);
    }

    @Override
    public void deleteById(Integer id) {
        parentRepository.deleteById(id);
    }

    @Override
    public void updateById(Parent parent, Integer id) {
        Parent parent1 = parentRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
        parent1.setProfile(parent.getProfile());
        parentRepository.save(parent1);
    }

    @Override
    public Parent getById(Integer id) {
        return parentRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
    }

    @Override
    public List<Parent> getParents() {
        return parentRepository.findAll();
    }
}
