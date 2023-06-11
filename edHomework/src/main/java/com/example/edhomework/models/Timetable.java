package com.example.edhomework.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Timetable {


    @Id
    private Integer id;

    @Column
    private Date date;

    @ManyToMany(mappedBy = "class_id")
    private List<Class> aClass;

    @Column
    private Integer room;

    @ManyToOne
    @JoinColumn(name = "id")
    private Teacher teacher;

}
