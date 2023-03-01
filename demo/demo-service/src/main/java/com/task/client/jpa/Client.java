package com.task.client.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "clients")
public class Client {
    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "about")
    private String about;

    @Column(name = "token")
    private String token;

    @Column(name = "country")
    private String country;

    @Column(name = "location")
    private String location;

    @Column(name = "lng")
    private String lng;

    @Column(name = "lat")
    private String lat;

    @Column(name = "dob")
    private String dob;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "userType")
    private Integer userType;

    @Column(name = "userStatus")
    private Integer userStatus;

    @Column(name = "profilePicture")
    private String profilePicture;

    @Column(name = "coverPicture")
    private String coverPicture;

    @Column(name = "enablefollowme")
    private Boolean enablefollowme;

    @Column(name = "sendmenotifications")
    private Boolean sendmenotifications;

    @Column(name = "sendTextmessages")
    private Boolean sendTextmessages;

    @Column(name = "enabletagging")
    private Boolean enabletagging;

    @Column(name = "createdAt")
    private String createdAt;
    @Column(name = "updatedAt")
    private String updatedAt;
    @Column(name = "livelng")
    private Double livelng;

    @Column(name = "livelat")
    private Double livelat;

    @Column(name = "liveLocation")
    private String liveLocation;
    @Column(name = "creditBalance")
    private Integer creditBalance;
    @Column(name = "myCash")
    private Integer myCash;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getCoverPicture() {
        return coverPicture;
    }

    public void setCoverPicture(String coverPicture) {
        this.coverPicture = coverPicture;
    }

    public Boolean getEnablefollowme() {
        return enablefollowme;
    }

    public void setEnablefollowme(Boolean enablefollowme) {
        this.enablefollowme = enablefollowme;
    }

    public Boolean getSendmenotifications() {
        return sendmenotifications;
    }

    public void setSendmenotifications(Boolean sendmenotifications) {
        this.sendmenotifications = sendmenotifications;
    }

    public Boolean getSendTextmessages() {
        return sendTextmessages;
    }

    public void setSendTextmessages(Boolean sendTextmessages) {
        this.sendTextmessages = sendTextmessages;
    }

    public Boolean getEnabletagging() {
        return enabletagging;
    }

    public void setEnabletagging(Boolean enabletagging) {
        this.enabletagging = enabletagging;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Double getLivelng() {
        return livelng;
    }

    public void setLivelng(Double livelng) {
        this.livelng = livelng;
    }

    public Double getLivelat() {
        return livelat;
    }

    public void setLivelat(Double livelat) {
        this.livelat = livelat;
    }

    public String getLiveLocation() {
        return liveLocation;
    }

    public void setLiveLocation(String liveLocation) {
        this.liveLocation = liveLocation;
    }

    public Integer getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(Integer creditBalance) {
        this.creditBalance = creditBalance;
    }

    public Integer getMyCash() {
        return myCash;
    }

    public void setMyCash(Integer myCash) {
        this.myCash = myCash;
    }
}

