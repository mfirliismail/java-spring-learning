package com.learning.app.SharedDto;

import java.io.Serializable;

public class UserDto implements Serializable {

    private long id;
    private String userId;
    private String fullName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private Boolean emailVerificationStatus = false;


    public String getEmail() {
        return email;
    }
    public Boolean getEmailVerificationStatus() {
        return emailVerificationStatus;
    }
    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }
    public String getEncryptedPassword() {
        return encryptedPassword;
    }
    public String getFullName() {
        return fullName;
    }
    public long getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public String getUserId() {
        return userId;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
    }
    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    
}
