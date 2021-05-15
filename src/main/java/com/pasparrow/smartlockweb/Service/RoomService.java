package com.pasparrow.smartlockweb.Service;

import com.pasparrow.smartlockweb.Domain.Room;
import com.pasparrow.smartlockweb.Dto.RoomDto;
import com.pasparrow.smartlockweb.Repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class RoomService {
    private RoomRepository roomRepository;

    @Transactional
    public Integer reserveRoom(RoomDto roomDto){
        System.out.println(roomDto.getRoomNum());
        return roomRepository.save(roomDto.toEntity()).getRoomNum();
    }

    @Transactional
    public List<RoomDto> getRoomlist(){
        List<Room> rooms = roomRepository.findAll();
        List<RoomDto> roomDtoList = new ArrayList<>();

        for(Room room : rooms){
            RoomDto roomDto = RoomDto.builder()
                    .roomNum(room.getRoomNum())
                    .roomReserve(room.getRoomReserve())
                    .roomIs(room.isRoomIs())
                    .build();

            roomDtoList.add(roomDto);
        }
        return roomDtoList;
    }
}
