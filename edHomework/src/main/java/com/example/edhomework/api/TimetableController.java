package com.example.edhomework.api;

import com.example.edhomework.models.Class;
import com.example.edhomework.models.Timetable;
import com.example.edhomework.service.impl.BaseTimetableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timetable")
@RequiredArgsConstructor
public class TimetableController {

    private final BaseTimetableService timetableService;

    @GetMapping("/{id}")
    public Timetable getTimetableById(@PathVariable Integer id) {
        return timetableService.getById(id);
    }

    @GetMapping("/all")
    public List<Timetable> getTimetable() {
        return timetableService.getTimetables();
    }

    @PostMapping("/create")
    public void createTimetable(@RequestBody Timetable timetable) {
        timetableService.createTimetable(timetable);
    }

    @PutMapping("/{id}")
    public void updateTimetable(@RequestBody Timetable timetable, @PathVariable Integer id) {
        timetableService.updateById(timetable, id);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Integer id) {
        timetableService.deleteById(id);
    }

}
