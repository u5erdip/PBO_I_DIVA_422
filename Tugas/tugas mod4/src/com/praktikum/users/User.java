package com.praktikum.users;

public abstract class User {
    String username;
    String password;
    String nama;
    String nim;

    public User() {
        this.username = "admin";
        this.password = "admin422";
        this.nama = "Diva";
        this.nim = "422";
    }

    public abstract boolean login(String inputUsername, String inputPassword);

    public abstract void displayAppMenu();

    public abstract void tampilkanInfo();

}