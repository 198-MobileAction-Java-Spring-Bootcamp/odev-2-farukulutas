package com.farukulutas.demo.dao;

import com.farukulutas.demo.entity.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityDao extends JpaRepository<City, Long> {

    @Query("SELECT c FROM City c WHERE c.plate = ?1")
    City findCityByPlate(int plate);
}