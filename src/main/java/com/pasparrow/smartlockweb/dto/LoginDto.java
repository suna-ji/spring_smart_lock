package com.pasparrow.smartlockweb.dto;

/**
 * 로그인 정보
 *
 * @author ji
*/


public class LoginDto {

    private String userId;
    private String password;
    private String errorMsg;

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getErrorMsg() { return errorMsg; }
    public void setErrorMsg(String errorMsg) { this.errorMsg = errorMsg; }
}
