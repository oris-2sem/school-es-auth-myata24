package com.example.edhomework.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private Integer id;

    private String surname;

    private String name;

    private Integer classId;

    private Integer parentId;

}
