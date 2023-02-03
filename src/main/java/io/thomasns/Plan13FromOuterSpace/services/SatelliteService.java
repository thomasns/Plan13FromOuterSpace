package io.thomasns.Plan13FromOuterSpace.services;

import io.thomasns.Plan13FromOuterSpace.domain.Satellite;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface SatelliteService {

    Set<Satellite> getSatellites();
    Satellite findById(int id);
    Satellite findByInternationalDesignator(int designator);

}
