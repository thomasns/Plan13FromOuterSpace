package io.thomasns.Plan13FromOuterSpace.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class KeplerianElements {

    //For a good explination of Keplerian Elements see
    //https://www.amsat.org/keplerian-elements-tutorial/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    private Satellite satellite;
    private byte epochYear;
    private float epochDay;
    private Timestamp epoch; //todo need to convert epoch year and day at insert time
    private float inclination;
    private float RightAscensionAscendingNode;
    private float argumentOfPerigee;
    private float eccentricity;
    private float meanAnomaly;
    private float meanMotion;
    private int orbitNumber;



}
