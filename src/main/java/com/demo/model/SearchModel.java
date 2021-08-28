package com.demo.model;

public class SearchModel {

    private String name;
    private String identityCard;

    public SearchModel() {
    }

    public SearchModel(String name, String identityCard) {
        this.name = name;
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
}
