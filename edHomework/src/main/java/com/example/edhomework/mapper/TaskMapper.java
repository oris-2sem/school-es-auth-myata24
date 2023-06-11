package com.example.edhomework.mapper;

import com.example.edhomework.dto.TaskDto;
import com.example.edhomework.models.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    Task toEntity(TaskDto taskDto);

    TaskDto toDto(Task task);
}
