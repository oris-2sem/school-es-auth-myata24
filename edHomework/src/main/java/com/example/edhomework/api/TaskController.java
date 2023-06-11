package com.example.edhomework.api;

import com.example.edhomework.models.Task;
import com.example.edhomework.service.impl.BaseTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private final BaseTaskService taskService;

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Integer id) {
        return taskService.getById(id);
    }

    @GetMapping("/all")
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping("/create")
    public void createTask(@RequestBody Task task) {
        taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public void updateClass(@RequestBody Task task, @PathVariable Integer id) {
        taskService.updateById(task, id);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Integer id) {
        taskService.deleteById(id);
    }

}
