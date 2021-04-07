package com.ubicov.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ubicov.app.domain.CovidData;


@Repository
public interface CovidDataRepository extends JpaRepository<CovidData, Long> {
    @Query(value = "SELECT * FROM covid_data c WHERE c.district= ?1", nativeQuery = true)
    CovidData findCovidDataByDistrict(String district);
}