package io.thomasns.Plan13FromOuterSpace.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("transmitter")
public class Transmitter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Satellite satellite;
    private String downlinkFrequency;
    @Lob
    private String notes;


}
