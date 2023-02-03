package io.thomasns.Plan13FromOuterSpace.services;

import io.thomasns.Plan13FromOuterSpace.domain.KeplerianElements;
import io.thomasns.Plan13FromOuterSpace.domain.Satellite;

import java.util.Set;

public interface KeplerianElementService {

    Set<KeplerianElements> getElementsBySatellite(Satellite satellite);
    KeplerianElements findMostRecentBySatellite(Satellite satellite);

}
