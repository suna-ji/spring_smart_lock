package com.fasparrow.smartlockweb.controller;

import com.fasparrow.smartlockweb.dto.Member;
import com.fasparrow.smartlockweb.dto.Reservation;
import com.fasparrow.smartlockweb.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/reservations")
public class ReservationApiController {
    private ReservationService reservationService;

    @GetMapping("/select/{reservationId}")
    private Reservation.Response getReservationsByPK(long reservationPK) {
        return reservationService.getReservationsByPK(reservationPK);
    }

    @GetMapping
    private Reservation.Response getReservationsByMember(long memberPK) {
        return reservationService.getReservationsByMember(memberPK);
    }

    @PostMapping
    private Reservation.Info addReservation(Reservation.Request reservation) {
        return reservationService.addReservation(reservation);
    }

    
    @PostMapping
    private Reservation.Info cancelReservation(int reservationPK, long memberPK) {
        return reservationService.cancelReservation(reservationPK, memberPK);
    }
}
