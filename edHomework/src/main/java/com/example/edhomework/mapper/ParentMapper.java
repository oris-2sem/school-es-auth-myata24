package com.example.edhomework.mapper;

import com.example.edhomework.dto.ParentDto;
import com.example.edhomework.models.Parent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ParentMapper {

    Parent toEntity(ParentDto parentDto);

    ParentDto toDto(Parent parent);

}
