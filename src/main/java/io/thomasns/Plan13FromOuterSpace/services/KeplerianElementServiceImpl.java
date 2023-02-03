package io.thomasns.Plan13FromOuterSpace.services;

import io.thomasns.Plan13FromOuterSpace.domain.KeplerianElements;
import io.thomasns.Plan13FromOuterSpace.domain.Satellite;
import io.thomasns.Plan13FromOuterSpace.repositories.KeplerianElementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
@Service
public class KeplerianElementServiceImpl implements KeplerianElementService{


    KeplerianElementRepository keplerianElementRepository;


    public KeplerianElementServiceImpl(KeplerianElementRepository keplerianElementRepository)
    {
        this.keplerianElementRepository = keplerianElementRepository;
    }

    @Override
    public Set<KeplerianElements> getElementsBySatellite(Satellite satellite) {
        log.debug("Searching for all Keps by Satellite");
        Set<KeplerianElements> keps = keplerianElementRepository.findBySatelliteID(satellite.getSatelliteId());
        return keps;
    }

    @Override
    public KeplerianElements findMostRecentBySatellite(Satellite satellite) {

        throw new RuntimeException("Not yet implemented");
    }
}
