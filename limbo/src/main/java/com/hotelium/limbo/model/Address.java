package com.hotelium.limbo.model;

import com.hotelium.limbo.generic.GenericEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address extends GenericEntity {
    
    @Setter
    @Column
    private String street;

    @Setter
    @Column
    private Number number;

    @Setter
    @Column
    private String neigborhood;

    @Setter
    @Column
    private String city;

    @Setter 
    @Column
    private String state;
}
