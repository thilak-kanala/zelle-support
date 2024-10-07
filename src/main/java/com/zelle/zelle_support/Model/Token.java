package com.zelle.zelle_support.Model;

public class Token {

    private Long id;
    private String token;
    private String tokenType;
    private String tokenStatus;

    public Token(Long id, String token, String tokenType, String tokenStatus) {
        this.id = id;
        this.token = token;
        this.tokenType = tokenType;
        this.tokenStatus = tokenStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getTokenStatus() {
        return tokenStatus;
    }

    public void setTokenStatus(String tokenStatus) {
        this.tokenStatus = tokenStatus;
    }

    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", tokenStatus='" + tokenStatus + '\'' +
                '}';
    }
}
