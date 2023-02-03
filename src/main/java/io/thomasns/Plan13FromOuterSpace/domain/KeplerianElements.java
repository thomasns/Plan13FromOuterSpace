package io.thomasns.Plan13FromOuterSpace.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class KeplerianElements {

    //For a good explination of Keplerian Elements see
    //https://www.amsat.org/keplerian-elements-tutorial/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private int satelliteID;
    private byte epochYear;
    private float epochDay;
    private float Inclination;
    private float Eccentricity;
    private float argumentOfPerigee;
    private float meanAnomaly;
    private float meanMotion;
    private double decayRate = 1E-8;
    private int orbitNumber;



}
