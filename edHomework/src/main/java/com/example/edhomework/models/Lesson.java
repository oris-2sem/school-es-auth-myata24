package com.example.edhomework.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {

    @Id
    private Integer id;

    @Column
    private String theme;

    @Column
    private String subject;

    @OneToMany(mappedBy = "timetable")
    private Timetable timetable;

}

