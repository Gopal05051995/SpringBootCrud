package com.xadmin.SpringBootCrud.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "TB_SUBJECT")
public class Subject {

    @Id
    private String id;
    private String name;
}
