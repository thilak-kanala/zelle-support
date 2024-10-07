package com.zelle.zelle_support.Model;

public class Recipients {

    private String EWSToken;
    private String token;
    private String status;
    private String recipientName;

    @Override
    public String toString() {
        return "Recipients{" +
                "EWSToken='" + EWSToken + '\'' +
                ", token='" + token + '\'' +
                ", status='" + status + '\'' +
                ", recipientName='" + recipientName + '\'' +
                '}';
    }

    public Recipients(String EWSToken, String token, String status, String recipientName) {
        this.EWSToken = EWSToken;
        this.token = token;
        this.status = status;
        this.recipientName = recipientName;
    }

    public String getEWSToken() {
        return EWSToken;
    }

    public void setEWSToken(String EWSToken) {
        this.EWSToken = EWSToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }
}
