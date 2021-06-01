package com.fasparrow.smartlockweb.dto;

import javax.validation.constraints.NotNull;
import java.util.List;

public class Room {
    public static class Info {
        private long roomId;
        private String roomName;
        private String price;

        public long getRoomId() {
            return roomId;
        }

        public void setRoomId(long roomId) {
            this.roomId = roomId;
        }

        public String getRoomName() {
            return roomName;
        }

        public void setRoomName(String roomName) {
            this.roomName = roomName;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }

    public static class Request {

        @NotNull
        private long roomId;

        @NotNull
        private String roomName;

        @NotNull
        private String price;

        public Long getRoomId() {
            return roomId;
        }

        public void setRoomId(Long roomId) {
            this.roomId = roomId;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }

    public static class Response {
        private final List<Room.Info> rooms;

        public static class Builder {
            private List<Room.Info> rooms;

            public Builder rooms(List<Room.Info> value) {
                rooms = value;
                return this;
            }

            public Response build() { return new Response(this); }
        }

        private Response(Builder builder) {
            rooms = builder.rooms;
        }

        public List<Room.Info> getCustomers() {
            return rooms;
        }
    }
}
