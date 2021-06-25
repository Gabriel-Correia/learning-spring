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
    private String roomId;

    @Column(name="GUEST_ID")
    private String guestId;

    @Column(name="RES_DATE")
    private String resDate;


    public long getReservationId() {
        return this.reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getGuestId() {
        return this.guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getResDate() {
        return this.resDate;
    }

    public void setResDate(String resDate) {
        this.resDate = resDate;
    }
    
}
