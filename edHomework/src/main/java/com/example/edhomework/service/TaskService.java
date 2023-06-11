package com.example.edhomework.service;

import com.example.edhomework.models.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {

    void createTask(Task task);

    void deleteById(Integer id);

    void updateById(Task task, Integer id);

    Task getById(Integer id);

    List<Task> getTasks();

}
