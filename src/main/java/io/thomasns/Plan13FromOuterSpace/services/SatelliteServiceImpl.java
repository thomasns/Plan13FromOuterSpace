package io.thomasns.Plan13FromOuterSpace.services;

import io.thomasns.Plan13FromOuterSpace.domain.Satellite;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Slf4j
public class SatelliteServiceImpl implements SatelliteService {
    @Override
    public Set<Satellite> getSatellites() {
        return null;
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
