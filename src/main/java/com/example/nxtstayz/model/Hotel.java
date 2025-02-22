package com.example.nxtstayz.model;

import javax.persistence.*;
import com.example.nxtstayz.model.Room;

@Entity
@Table(name = "hotel")

public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotelid")
    private int hotelId;
    @Column(name = "hotelname")
    private String hotelName;
    @Column(name = "location")
    private String location;
    @Column(name = "rating")
    private int rating;
    @OneToMany(mappedBy = "hotel")
    private Room room;

    public Hotel() {
    }

    public Hotel(int hotelId, String hotelName, String location, int rating) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.location = location;
        this.rating = rating;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}