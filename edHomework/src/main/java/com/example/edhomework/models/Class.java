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
public class Class {

    @Id
    private Integer id;

    @OneToOne(mappedBy = "teacher_id")
    private Teacher teacher;

}
