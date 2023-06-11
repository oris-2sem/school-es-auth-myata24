package com.example.edhomework.api;

import com.example.edhomework.models.Parent;
import com.example.edhomework.service.impl.BaseParentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/parent")
@RestController
public class ParentController {

    private final BaseParentService parentService;

    @GetMapping("/{id}")
    public Parent getParentById(@PathVariable Integer id) {
        return parentService.getById(id);
    }

    @GetMapping("/all")
    public List<Parent> getParents() {
        return parentService.getParents();
    }

    @PostMapping("/create")
    public void createParent(@RequestBody Parent parent) {
        parentService.createParent(parent);
    }

    @PutMapping("/{id}")
    public void updateParent(@RequestBody Parent parent, @PathVariable Integer id) {
        parentService.updateById(parent, id);
    }

    @DeleteMapping("/{id}")
    public void deleteParent(@PathVariable Integer id) {
        parentService.deleteById(id);
    }

}
