package com.hotelium.limbo.model;

import java.util.List;

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
@Table(name = "hotels")
public class Hotel extends GenericEntity {
    @Setter
    @Column
    private String name;

    @Setter
    @Column
    private String description;
    
    @Setter
    @Column
    private Address address;

    @Setter
    @Column
    private List<Number> avaliations;

    @Setter
    @Column
    private List<Room> availableRooms;
}
