package com.example.edhomework.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {

    private String commentary;

    private String description;

    private String type;

    private char mark;

    private Integer lessonId;

}
