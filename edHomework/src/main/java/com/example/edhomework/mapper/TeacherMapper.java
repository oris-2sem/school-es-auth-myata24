package com.example.edhomework.mapper;

import com.example.edhomework.dto.TeacherDto;
import com.example.edhomework.models.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    Teacher toEntity(TeacherDto teacherDto);

    TeacherDto toDto(Teacher teacher);

}
