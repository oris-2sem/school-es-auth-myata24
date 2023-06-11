package com.example.edhomework.service.impl;

import com.example.edhomework.exception.NotFound;
import com.example.edhomework.models.Task;
import com.example.edhomework.repository.TaskRepository;
import com.example.edhomework.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BaseTaskService implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public void createTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void deleteById(Integer id) {
        taskRepository.deleteById(id);
    }

    @Override
    public void updateById(Task task, Integer id) {
        Task task1 = taskRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
        task1.setCommentary(task.getCommentary());
        task1.setDescription(task.getDescription());
        task1.setLesson(task.getLesson());
        task1.setType(task.getType());
        taskRepository.save(task1);
    }

    @Override
    public Task getById(Integer id) {
        return taskRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }
}
