package com.fasparrow.smartlockweb.service;

import com.fasparrow.smartlockweb.dto.Reservation;

public interface ReservationService {

    Reservation.Response getReservationsByPK(long reservationPK);

    Reservation.Response getReservationsByMember(long memberId);

    Reservation.Info addReservation(Reservation.Request reservationDto);

    Reservation.Info cancelReservation(long reservationId, long memberId);
}
