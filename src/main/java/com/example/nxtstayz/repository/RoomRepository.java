package com.example.nxtstayz.repository;

import com.example.nxtstayz.model.*;

import java.util.*;

public interface RoomRepository {
    ArrayList<Room> getRooms();

    Room getRoomById(int roomId);

    Room addRoom(Room room);

    Room updateRoom(int roomId, Room room);

    void deleteRoom(int roomId);

    Hotel getRoomHotel(int roomId);
}