package com.demo.entity;

public class Person {

    private int id;
    private String name;
    private String phone;
    private String address;
    private String identityCard;
    private String district;
    private String ward;

    public Person() {
    }

    public Person(int id, String name, String phone, String address, String identityCard, String district, String ward) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.identityCard = identityCard;
        this.district = district;
        this.ward = ward;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }
}
