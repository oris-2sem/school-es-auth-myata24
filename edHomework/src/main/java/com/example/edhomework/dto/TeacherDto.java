package com.example.edhomework.dto;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDto {

    private Integer id;

    private String name;

    private String surname;

    private Integer profile;

}
