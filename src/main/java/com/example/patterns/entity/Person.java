package com.example.patterns.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@Entity
public class Person implements Serializable {

    @Id
    @Column(name="ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @OneToMany(mappedBy = "person")
    private List<Phone> phoneList;

    @OneToMany(mappedBy = "person")
    private List<Address> addressList;


}
