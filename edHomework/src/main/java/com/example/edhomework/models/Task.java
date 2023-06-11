package com.example.edhomework.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    private Integer id;

    @Column
    private String commentary;

    @Column
    private String description;

    @Column
    private String type;

    @OneToOne(mappedBy = "lesson_id")
    private Lesson lesson;

}
