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
public class Students {

    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private String surname;

    @OneToOne(mappedBy = "class_id")
    private Class classId;

    @OneToOne(mappedBy = "parent_id")
    private Parent parent;
}
