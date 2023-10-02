package com.hotelium.limbo.model;

import com.hotelium.limbo.enums.RoomTypeEnum;
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
@Table(name = "Rooms")
public class Room extends GenericEntity {
     
    @Setter
    @Column
    private Number roomNumber;

    @Setter
    @Column
    private String description;

    @Setter
    @Column
    private RoomTypeEnum roomType;

    @Setter
    @Column
    private String coastHour;

    @Setter
    @Column
    private String availability;
}
