package com.offcn.jap.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name",nullable = true,length = 255)
    private String name;

    @Column(name = "age",nullable = true,length = 255)
    private Integer age;

}
