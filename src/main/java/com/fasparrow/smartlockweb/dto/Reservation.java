package com.fasparrow.smartlockweb.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Date;

public class Reservation {
    public static class Info {
        private String reservationPK;
        private long customerId;
        private long roomId;
        private String roomPassword;
        private boolean isCancel;
        private Date startTime;
        private Date endTime;
        private Date createDate;
        private Date modifyDate;

        public String getReservationPK() {
            return reservationPK;
        }

        public void setReservationPK(String reservationPK) {
            this.reservationPK = reservationPK;
        }

        public long getCustomerId() {
            return customerId;
        }

        public void setCustomerId(long customerId) {
            this.customerId = customerId;
        }

        public long getRoomId() {
            return roomId;
        }

        public void setRoomId(long roomId) {
            this.roomId = roomId;
        }

        public String getRoomPassword() {
            return roomPassword;
        }

        public void setRoomPassword(String roomPassword) {
            this.roomPassword = roomPassword;
        }

        public boolean isCancel() {
            return isCancel;
        }

        public void setCancel(boolean cancel) {
            isCancel = cancel;
        }

        public Date getStartTime() {
            return startTime;
        }

        public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public Date getEndTime() {
            return endTime;
        }

        public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }

        public Date getCreateDate() {
            return createDate;
        }

        public void setCreateDate(Date createDate) {
            this.createDate = createDate;
        }

        public Date getModifyDate() {
            return modifyDate;
        }

        public void setModifyDate(Date modifyDate) {
            this.modifyDate = modifyDate;
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

//    public static class ResultInfo {
//        private final String reservationPK;
//        private final long customerId;
//        private final long roomId;
//        private final String roomPassword;
//        private final boolean isCancel;
//        private final Date startTime;
//        private final Date endTime;
//        private final Date createDate;
//        private final Date modifyDate;
//
//        public static class Builder {
//            private String reservationPK;
//            private long customerId;
//            private long roomId;
//            private String roomPassword;
//            private boolean isCancel;
//            private Date startTime;
//            private Date endTime;
//            private Date createDate;
//            private Date modifyDate;
//
//            public Builder reservationInfo(Reservation.Info value) {
//                reservationPK = value.getReservationPK();
//                customerId = value.getCustomerId();
//                roomId = value.getRoomId();
//                roomPassword = value.getRoomPassword();
//                isCancel = value.isCancel();
//                startTime = value.getStartTime();
//                endTime = value.getEndTime();
//                createDate = value.getCreateDate();
//                modifyDate = value.getModifyDate();
//
//                return this;
//            }
//
//            public ResultInfo build() { return new ResultInfo(this); }
//        }
//
//        public ResultInfo(Builder builder) {
//            reservationPK = builder.reservationPK;
//            customerId = builder.customerId;
//            roomId = builder.roomId;
//            roomPassword = builder.roomPassword;
//            isCancel = builder.isCancel;
//            startTime = builder.startTime;
//            endTime = builder.endTime;
//            createDate = builder.createDate;
//            modifyDate = builder.modifyDate;
//        }
//
//        public String getReservationPK() {
//            return reservationPK;
//        }
//
//        public long getCustomerId() {
//            return customerId;
//        }
//
//        public long getRoomId() {
//            return roomId;
//        }
//
//        public String getRoomPassword() {
//            return roomPassword;
//        }
//
//        public boolean isCancel() {
//            return isCancel;
//        }
//
//        public Date getStartTime() {
//            return startTime;
//        }
//
//        public Date getEndTime() {
//            return endTime;
//        }
//
//        public Date getCreateDate() {
//            return createDate;
//        }
//
//        public Date getModifyDate() {
//            return modifyDate;
//        }
//    }
}
