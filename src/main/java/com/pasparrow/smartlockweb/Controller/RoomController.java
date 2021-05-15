package com.pasparrow.smartlockweb.Controller;

import com.pasparrow.smartlockweb.Dto.RoomDto;
import com.pasparrow.smartlockweb.Service.RoomService;
import lombok.AllArgsConstructor;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class RoomController {
    private RoomService roomService;
//    @GetMapping("/room/test")
//    public String roomTest(Model model){
//        model.addAttribute("room", new RoomDto());
//        return "room/roomStatus";
//    }

    @GetMapping("/room/reserveRoom")
    public String roomTest(Model model){
        model.addAttribute("room", new RoomDto());
        return "room/roomReserve";
    }
    @PostMapping("/room/reserveRoom")
    public String roomServe(RoomDto roomDto){
        roomService.reserveRoom(roomDto);
        return "redirect:/";
    }

    @GetMapping("/room/statusRoom")
    public String roomStatus(Model model){
        List<RoomDto> roomDtoList = roomService.getRoomlist();
        model.addAttribute("roomList", roomDtoList);
        return "room/roomStatus";
    }
}
