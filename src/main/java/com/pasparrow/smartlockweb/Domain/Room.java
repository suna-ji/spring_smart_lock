package com.pasparrow.smartlockweb.Domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue
    private Integer roomId;
    private String roomNum;
    private boolean roomIs;
    private String roomReserve;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Builder
    public Room(Integer roomId, String roomNum, boolean roomIs, String roomReserve){
        this.roomId = roomId;
        this.roomNum = roomNum;
        this.roomIs = roomIs;
        this.roomReserve = roomReserve;
    }
}
