package com.learning.app.Models;

public class UserDetailsRequestModel {
    
    private String fullName;
    private String email;
    private String password;


    public String getEmail() {
        return email;
    }
    public String getFullName() {
        return fullName;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
