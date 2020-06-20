package com.dkatalis.parkinglot.model;

import lombok.*;
import org.apache.commons.lang3.builder.EqualsBuilder;

@Builder
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Vehicle {

    @EqualsAndHashCode.Include
    private String registrationNumber;

}
