/**
 * @Author - Richard Renaud
 * This Class contains all the CRUD operations for accessing geo-locations.
 */
package com.ubicov.app.service;

import com.ubicov.app.domain.GeoLocation;
import com.ubicov.app.repository.GeoLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeoLocationService {

    @Autowired
    private GeoLocationRepository geoLocationRepository;

    public GeoLocationService(GeoLocationRepository geoLocationRepository) {
        this.geoLocationRepository = geoLocationRepository;
    }

    /**
     * @param district
     * @return
     */
    public GeoLocation getLocByDistrict(String district) {
        return geoLocationRepository.findByDistrict(district);
    }

    public List<GeoLocation> getAll() {
        return geoLocationRepository.findAll();
    }
}
