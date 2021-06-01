package com.pasparrow.smartlockweb.dto;

public class RoomDto {
    public static class Info {

        private long roomId;
        private String roomName;
        private String price;

        public long getRoomId() {
            return roomId;
        }

        public void setRoomId(Integer roomId) {
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
        private final List<RoomDto.Info> rooms;

        public static class Builder {
            private List<RoomDto.Info> rooms;

            public RoomDto.Response.Builder rooms(List<RoomDto.Info> value) {
                rooms = value;
                return this;
            }

            public RoomDto.Response build() { return new RoomDto.Response(this); }
        }

        private Response(CustomerDto.Response.Builder builder) {
            rooms = builder.rooms;
        }

        public List<RoomDto.Info> getCustomers() {
            return rooms;
        }
    }
}
