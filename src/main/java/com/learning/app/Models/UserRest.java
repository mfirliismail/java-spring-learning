package com.learning.app.Models;

public class UserRest {
    
    private String userId;
    private String fullName;
    private String email;

    public String getEmail() {
        return email;
    }
    public String getFullName() {
        return fullName;
    }
    public String getUserId() {
        return userId;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
