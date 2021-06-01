package com.pasparrow.smartlockweb.dto;

/**
 * 사용자 정보
 *
 * @author ji
 */

public class CustomerDto {
    public static class Info {
        private String userPK;
        private String userId;
        private String password;
        private String userName;
        private String email;
        private String phoneNumber;

        public String getUserPK() {
            return userPK;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }


    }

    public static class Request {

        @NotNull
        private String userId;

        @NotNull
        private String password;

        @NotNull
        private String userName;

        //정규식 추가
        @NotNull
        private String email;

        @NotNull
        @Pattern(regexp = "(01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})|[0-9]{2,3}-[0-9]{3,4}-[0-9]{4})")
        private String phoneNumber;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }


    public static class Response {
        private final List<CustomerDto.Info> customer;

        public static class Builder {
            private List<CustomerDto.Info> customers;

            public CustomerDto.Response.Builder customers(List<CustomerDto.Info> value) {
                customers = value;
                return this;
            }

            public CustomerDto.Response build() { return new CustomerDto.Response(this); }
        }

        private Response(CustomerDto.Response.Builder builder) {
            customers = builder.customers;
        }

        public List<CustomerDto.Info> getCustomers() {
            return customers;
        }
    }

}
