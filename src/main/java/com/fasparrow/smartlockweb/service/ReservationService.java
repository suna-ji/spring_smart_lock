package com.fasparrow.smartlockweb.service;

import com.fasparrow.smartlockweb.dto.Reservation;

public interface ReservationService {
    Reservation.Response getReservations(String memberId);

    Reservation.Info addReservation(Reservation.Request reservationDto);

    Reservation.Info cancelReservation(int reservationId, String memberId);
}
