package com.pasparrow.smartlockweb.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Date;

public class Reservation {
    public static class Info {
        private String ReservationPK;
        private long customerId;
        private long roomId;
        private String RoomPassword;
        private boolean isCancel;
        private Date startTime;
        private Date endTime;
        private Date createDate;
        private Date modifyDate;

        public String getReservationPK() {
            return ReservationPK;
        }

        public int getReservationInfoId() {
            return reservationInfoId;
        }

        public String getReservationName() {
            return reservationName;
        }

        public long getCustomerId() {
            return customerId;
        }

        public boolean isCancel() {
            return isCancel;
        }

        public String getReservationDate() {
            return reservationDate;
        }

        public Date getCreateDate() {
            return createDate;
        }

        public Date getModifyDate() {
            return modifyDate;
        }
    }

    public static class Request {
        @NotNull
        private String reservationName;

        @NotNull
        @Pattern(regexp = "(01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})|[0-9]{2,3}-[0-9]{3,4}-[0-9]{4})")
        private String reservationPhone;

        public String getReservationName() {
            return reservationName;
        }

        public void setReservationName(String reservationName) {
            this.reservationName = reservationName;
        }

        public String getReservationPhone() {
            return reservationPhone;
        }

        public void setReservationPhone(String reservationPhone) {
            this.reservationPhone = reservationPhone;
        }
    }

    public static class Response {
        private final List<Reservation.Info> reservations;

        public static class Builder {
            private List<Reservation.Info> reservations;

            public Builder reservations(List<Reservation.Info> value) {
                reservations = value;

                return this;
            }

            public Response build() { return new Response(this); }
        }

        private Response(Builder builder) {
            reservations = builder.reservations;
        }

        public List<Reservation.Info> getReservations() {
            return reservations;
        }
    }

    public static class ResultInfo {
        private final int reservationInfoId;
        private final String reservationName;
        private final String reservationPhone;
        private final boolean isCancel;
        private final String reservationDate;
        private final String createDate;
        private final String modifyDate;

        public static class Builder {
            private int reservationInfoId;
            private String reservationName;
            private String reservationPhone;
            private boolean isCancel;
            private String reservationDate;
            private String createDate;
            private String modifyDate;

            public Builder reservationInfo(Reservation.Info value) {
                reservationInfoId = value.getReservationInfoId();
                reservationName = value.getReservationName();
                reservationPhone = value.getReservationPhone();
                isCancel = value.isCancel();
                reservationDate = value.getReservationDate();
                createDate = value.getCreateDate();
                modifyDate = value.getModifyDate();

                return this;
            }

            public ResultInfo build() { return new ResultInfo(this); }
        }

        public ResultInfo(Builder builder) {
            reservationInfoId = builder.reservationInfoId;
            reservationName = builder.reservationName;
            reservationPhone = builder.reservationPhone;
            isCancel = builder.isCancel;
            reservationDate = builder.reservationDate;
            createDate = builder.createDate;
            modifyDate = builder.modifyDate;
        }

        public int getReservationInfoId() {
            return reservationInfoId;
        }

        public String getReservationName() {
            return reservationName;
        }

        public String getReservationPhone() {
            return reservationPhone;
        }

        public boolean isCancel() {
            return isCancel;
        }

        public String getReservationDate() {
            return reservationDate;
        }

        public String getCreateDate() {
            return createDate;
        }

        public String getModifyDate() {
            return modifyDate;
        }
    }
}
