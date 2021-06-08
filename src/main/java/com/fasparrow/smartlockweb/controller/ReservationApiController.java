package com.fasparrow.smartlockweb.controller;

import com.fasparrow.smartlockweb.service.ReservationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/reservations")
public class ReservationApiController {
    private final ReservationService reservationService;

    public ReservationApiController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
}
