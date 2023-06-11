package com.example.edhomework.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonDto {

    private Integer id;

    private String theme;

    private Integer timetable;

    private String subject;

}
