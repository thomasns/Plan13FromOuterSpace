package io.thomasns.Plan13FromOuterSpace.repositories;

import io.thomasns.Plan13FromOuterSpace.domain.KeplerianElements;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@DataJpaTest
class KeplerianElementRepositoryIT {


    @Autowired
    KeplerianElementRepository keplerianElementRepository;



    @BeforeEach
    void setUp() {
    }

    @Test
    void findBySatelliteId() {
        Integer testId = 25544;
        Set<KeplerianElements> keps = keplerianElementRepository.findBySatelliteId(testId);
        for(KeplerianElements kep : keps)
        {
            assertEquals(testId, kep.getSatellite().getId());
        }
    }

    @Test
    void findMostRecentKeplerianElementsForSatellite() {

        KeplerianElements keps = keplerianElementRepository.findMostRecentKeplerianElementsForSatellite(25544);
    }
}