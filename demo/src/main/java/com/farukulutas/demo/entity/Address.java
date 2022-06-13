package com.farukulutas.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "ADDRESS")
public class Address {

    @Id
    @SequenceGenerator(name = "Address", sequenceName = "ADDRESS_ID_SEQ")
    @GeneratedValue(generator = "Address")
    private Long id;

    @Column(name = "ADDRESS_NAME", length = 50, nullable = false)
    private String addressName;

    @Column(name = "COUNTRY", nullable = false)
    private Country country;

    @Column(name = "CITY", nullable = false)
    private City city;

    @Column(name = "DISTRICT", nullable = false)
    private District district;

    @Column(name = "NEIGHBOURHOOD", nullable = false)
    private Neighbourhood neighbourhood;

    @Column(name = "STREET", nullable = false)
    private Street street;

    @Column(name = "DOOR_NO", nullable = false)
    private DoorNumber doorNo;

    @Column(name = "APARTMENT_NO", nullable = false)
    private ApartmentNumber apartmentNo;
}