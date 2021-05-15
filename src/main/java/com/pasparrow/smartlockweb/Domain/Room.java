package com.pasparrow.smartlockweb.Domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Room {

    @Id
    @GeneratedValue
    private int roomNum;
    private boolean roomIs;
    private String roomReserve;

    @Builder
    public Room(int roomNum, boolean roomIs, String roomReserve){
        this.roomNum = roomNum;
        this.roomIs = roomIs;
        this.roomReserve = roomReserve;
    }
}
