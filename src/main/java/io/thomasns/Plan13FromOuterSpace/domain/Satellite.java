package io.thomasns.Plan13FromOuterSpace.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Satellite {

    @Id
    private Integer id;
    private String name;
    private String internationalDesignation;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="satellite")
    private Set<KeplerianElements> keplerianElementsSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="satellite")
    private Set<Transmitter> transmitterSet;

}
