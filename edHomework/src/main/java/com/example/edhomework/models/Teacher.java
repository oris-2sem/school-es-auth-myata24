package com.example.edhomework.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private Integer profile;

}
