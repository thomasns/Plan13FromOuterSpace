package io.thomasns.Plan13FromOuterSpace.repositories;

import io.thomasns.Plan13FromOuterSpace.domain.KeplerianElements;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface KeplerianElementRepository extends CrudRepository<KeplerianElements, Long> {

    Set<KeplerianElements> findBySatelliteID(Integer satelliteId);
}
