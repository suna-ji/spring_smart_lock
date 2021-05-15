package com.pasparrow.smartlockweb.Dto;

import com.pasparrow.smartlockweb.Domain.Room;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class RoomDto {
    private int roomNum;
    private boolean roomIs;
    private String roomReserve;

    public Room toEntity() {
        return Room.builder()
                    .roomNum(roomNum)
                    .roomIs(roomIs)
                    .roomReserve(roomReserve)
                    .build();
    }

    @Builder
    public RoomDto(int roomNum, boolean roomIs, String roomReserve){
        this.roomNum = roomNum;
        this.roomIs = roomIs;
        this.roomReserve = roomReserve;
    }
}
