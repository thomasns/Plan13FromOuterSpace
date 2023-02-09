package io.thomasns.Plan13FromOuterSpace.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("Repeater")
@Getter
@Setter
public class RepeaterTransmitter  extends Transmitter{

    private String uplinkFrequency;
    private String tone;

}
