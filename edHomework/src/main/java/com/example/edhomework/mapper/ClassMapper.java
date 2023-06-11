package com.example.edhomework.mapper;

import com.example.edhomework.dto.ClassDto;
import com.example.edhomework.models.Class;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClassMapper {

    Class toEntity(ClassDto classDto);

    ClassDto toDto(Class classes);

}
