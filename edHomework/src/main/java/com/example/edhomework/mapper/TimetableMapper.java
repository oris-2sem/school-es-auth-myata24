package com.example.edhomework.mapper;

import com.example.edhomework.dto.TimetableDto;
import com.example.edhomework.models.Timetable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TimetableMapper {

    Timetable toEntity(com.example.edhomework.dto.TimetableDto timetableDto);

    TimetableDto toDto(Timetable timetable);

}
