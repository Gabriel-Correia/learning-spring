package com.gabriel.correia.learningspring.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @Column(name="RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;

    @Column(name="ROOM_ID")
    private long roomId;

    @Column(name="GUEST_ID")
    private long guestId;

    @Column(name="RES_DATE")
    private String resDate;

    public long getReservationId() {
        return this.reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return this.guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public String getResDate() {
        return this.resDate;
    }

    public void setResDate(String resDate) {
        this.resDate = resDate;
    }

    
}
