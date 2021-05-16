package com.pasparrow.smartlockweb.Dto;

import com.pasparrow.smartlockweb.Domain.Room;
import lombok.*;

import javax.persistence.criteria.CriteriaBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class RoomDto {
    private Integer roomId;
    private String roomNum;
    private boolean roomIs;
    private String roomReserve;

    public Room toEntity() {
        return Room.builder()
                    .roomId(roomId)
                    .roomNum(roomNum)
                    .roomIs(roomIs)
                    .roomReserve(roomReserve)
                    .build();
    }

    @Builder
    public RoomDto(Integer roomId, String roomNum, boolean roomIs, String roomReserve){
        this.roomId = roomId;
        this.roomNum = roomNum;
        this.roomIs = roomIs;
        this.roomReserve = roomReserve;
    }
}
