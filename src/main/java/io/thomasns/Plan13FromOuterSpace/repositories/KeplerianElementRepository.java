package io.thomasns.Plan13FromOuterSpace.repositories;

import io.thomasns.Plan13FromOuterSpace.domain.KeplerianElements;
import io.thomasns.Plan13FromOuterSpace.domain.Satellite;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface KeplerianElementRepository extends CrudRepository<KeplerianElements, Long> {

    Set<KeplerianElements> findBySatelliteId(Integer satelliteId);

    //@Query(value = "SELECT * FROM keplerian_elements where EPOCH = (select max(epoch) from keplerian_elements where satellite_id = :#{#satellite})", nativeQuery = true )
    @Query(value = "SELECT * FROM keplerian_elements where EPOCH = (select max(epoch) from keplerian_elements where satellite_id = ?1)", nativeQuery = true )
    KeplerianElements findMostRecentKeplerianElementsForSatellite(Integer satelliteId);
}
