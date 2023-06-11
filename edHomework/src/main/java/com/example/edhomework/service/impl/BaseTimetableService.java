package com.example.edhomework.service.impl;

import com.example.edhomework.exception.NotFound;
import com.example.edhomework.models.Timetable;
import com.example.edhomework.repository.TimetableRepository;
import com.example.edhomework.service.TimetableService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class BaseTimetableService implements TimetableService {

    private final TimetableRepository timetableRepository;

    @Override
    public void createTimetable(Timetable timetable) {
        timetableRepository.save(timetable);
    }

    @Override
    public void deleteById(Integer id) {
        timetableRepository.deleteById(id);
    }

    @Override
    public void updateById(Timetable timetable, Integer id) {
        Timetable timetable1 = timetableRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
        timetable1.setDate(timetable.getDate());
        timetable1.setAClass(timetable.getAClass());
        timetable1.setRoom(timetable.getRoom());
        timetable1.setTeacher(timetable.getTeacher());
        timetableRepository.save(timetable1);
    }

    @Override
    public Timetable getById(Integer id) {
        return timetableRepository.findById(id).orElseThrow(() ->
                new NotFound("not found"));
    }

    @Override
    public List<Timetable> getTimetables() {
        return timetableRepository.findAll();
    }
}
