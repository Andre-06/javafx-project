package com.example.javafxproject;

public class Client {
    private String name;
    private String email;
    private String tel;
    private boolean promote;

    public Client() {
    }

    public Client(String name, String email, String tel, boolean promote) {
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.promote = promote;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isPromote() {
        return promote;
    }

    public void setPromote(boolean promote) {
        this.promote = promote;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", promote=" + promote +
                '}';
    }
}
