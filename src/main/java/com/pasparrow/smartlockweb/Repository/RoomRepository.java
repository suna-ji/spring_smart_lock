package com.pasparrow.smartlockweb.Repository;

import com.pasparrow.smartlockweb.Domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    Optional<Room> findByRoomNum(Integer roomNum);
}
