package com.example.edhomework.mapper;

import com.example.edhomework.dto.LessonDto;
import com.example.edhomework.models.Lesson;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LessonMapper {

    Lesson toEntity(LessonDto lessonDto);

    LessonDto toDto(Lesson lesson);

}
