package io.thomasns.Plan13FromOuterSpace.repositories;

import io.thomasns.Plan13FromOuterSpace.domain.Satellite;
import org.springframework.data.repository.CrudRepository;

public interface SatelliteRepository extends CrudRepository<Satellite, Integer> {
}
