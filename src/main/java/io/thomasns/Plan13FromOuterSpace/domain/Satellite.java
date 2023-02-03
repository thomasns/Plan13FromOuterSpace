package io.thomasns.Plan13FromOuterSpace.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Satellite {

    @Id
    private Integer satelliteId;
    private String satelliteName;
    private String internationalDesignation;

}
