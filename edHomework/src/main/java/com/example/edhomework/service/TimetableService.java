package com.example.edhomework.service;

import com.example.edhomework.models.Timetable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TimetableService {

    void createTimetable(Timetable timetable);

    void deleteById(Integer id);

    void updateById(Timetable timetable, Integer id);

    Timetable getById(Integer id);

    List<Timetable> getTimetables();

}
