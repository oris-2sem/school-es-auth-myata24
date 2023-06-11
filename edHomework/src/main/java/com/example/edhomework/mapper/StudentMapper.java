package com.example.edhomework.mapper;

import com.example.edhomework.dto.StudentDto;
import com.example.edhomework.models.Students;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Students toEntity(StudentDto studentDto);

    StudentDto toDto(Students students);

}
