package com.hotelium.limbo.model;

import java.util.Date;

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
@Table(name = "bookings")
public class Booking extends GenericEntity {
    
    @Setter
    @Column
    private int userId;

    @Setter
    @Column
    private int hotelId;

    @Setter
    @Column
    private String[] reservedRooms;

    @Setter
    @Column
    private Date checkIn;
    
    @Setter
    @Column
    private Date checkOut;
}
