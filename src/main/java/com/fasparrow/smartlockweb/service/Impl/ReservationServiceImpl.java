package com.fasparrow.smartlockweb.service.Impl;

import com.fasparrow.smartlockweb.dto.Reservation;
import com.fasparrow.smartlockweb.service.ReservationService;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Override
    public Reservation.Response getReservationsByPK(long reservationPK) {
        return null;
    }

    @Override
    public Reservation.Response getReservationsByMember(long memberId) {
        return null;
    }

    @Override
    public Reservation.Info addReservation(Reservation.Request reservationDto) {
        return null;
    }

    @Override
    public Reservation.Info cancelReservation(long reservationId, long memberId) {
        return null;
    }
}
