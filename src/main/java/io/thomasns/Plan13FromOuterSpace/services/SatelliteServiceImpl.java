package io.thomasns.Plan13FromOuterSpace.services;

import io.thomasns.Plan13FromOuterSpace.domain.Satellite;
import io.thomasns.Plan13FromOuterSpace.repositories.SatelliteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Slf4j
public class SatelliteServiceImpl implements SatelliteService {

    private final SatelliteRepository satelliteRepository;

    public SatelliteServiceImpl(SatelliteRepository satelliteRepository) {
        this.satelliteRepository = satelliteRepository;
    }

    @Override
    public Set<Satellite> getSatellites() {
        Set<Satellite> satelliteSet = new HashSet<>();
        satelliteRepository.findAll().iterator().forEachRemaining(satelliteSet::add);
        return satelliteSet;

    }

    @Override
    public Satellite findById(int id) {
        return null;
    }

    @Override
    public Satellite findByInternationalDesignator(int designator) {
        return null;
    }
}
