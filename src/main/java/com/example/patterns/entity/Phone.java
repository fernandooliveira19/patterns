package com.example.patterns.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Phone extends BaseEntity {

    @Id
    @Column(name="ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer prefix;

    private String number;

    @OneToMany
    @JoinColumn(name="PERSON_ID", referencedColumnName = "ID")
    private Person person;

}
