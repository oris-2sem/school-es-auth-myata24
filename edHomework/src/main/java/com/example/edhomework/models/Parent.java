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
public class Parent {

    @Id
    private Integer id;

    @Column
    private Integer profile;

}
