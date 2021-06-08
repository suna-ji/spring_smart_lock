package com.fasparrow.smartlockweb.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * 사용자 정보
 *
 * @author ji
 */

public class Member {
    public static class Info {
        private long memberPK;
        private String memberId;
        private String password;
        private String memberName;
        private String email;
        private String phoneNumber;

        public long getMemberPK() {
            return memberPK;
        }

        public void setMemberPK(long memberPK) {
            this.memberPK = memberPK;
        }

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
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
        private String memberId;

        @NotNull
        private String password;

        @NotNull
        private String memberName;

        @NotNull
        @Pattern(regexp = "\\b[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,4}\\b")
        private String email;

        @NotNull
        @Pattern(regexp = "(01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})|[0-9]{2,3}-[0-9]{3,4}-[0-9]{4})")
        private String phoneNumber;

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
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
        private final List<Member.Info> members;

        public static class Builder {
            private List<Member.Info> members;

            public Builder customers(List<Member.Info> value) {
                members = value;
                return this;
            }

            public Response build() { return new Response(this); }
        }

        private Response(Builder builder) {
            members = builder.members;
        }

        public List<Member.Info> getCustomers() {
            return members;
        }
    }

}
