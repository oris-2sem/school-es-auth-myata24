package com.example.edhomework.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class TimetableDto {

    private Integer id;

    private Date date;

    private Integer classId;

    private Integer room;

    private Integer teacherId;



}
