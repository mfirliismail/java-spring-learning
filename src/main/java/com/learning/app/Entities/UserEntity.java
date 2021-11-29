package com.learning.app.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="users") // table users
public class UserEntity implements Serializable{
    
    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    public String userId;

    @Column(nullable = false, length = 50)
    public String fullName;

    @Column(nullable = false, length = 50)
    public String email;

    @Column(nullable = false)
    public String encryptedPassword;

    public String emailVerificationToken;

    @Column(nullable = false)
    public String emailVerificationStatus;

    public String getEmail() {
        return email;
    }
    public String getEmailVerificationStatus() {
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
    public String getUserId() {
        return userId;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEmailVerificationStatus(String emailVerificationStatus) {
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
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
