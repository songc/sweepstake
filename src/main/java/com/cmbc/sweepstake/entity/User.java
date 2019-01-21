package com.cmbc.sweepstake.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String employeeId;

    @Column
    private String name;

    @Column
    private String phone;
}
