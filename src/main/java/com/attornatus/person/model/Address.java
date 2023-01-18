package com.attornatus.person.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_address")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="street")
    private String street;

    @Column(name="zip_code")
    private Long zipCode;

    @Column(name="number")
    private Long number;

    @Column(name="city")
    private String city;

    @ManyToOne
    @JoinColumn(name = "person")
    private Person person;

    @Column(name = "main_address")
    private boolean mainAddress;

}