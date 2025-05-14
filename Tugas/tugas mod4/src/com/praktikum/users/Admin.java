package com.praktikum.users;

import com.praktikum.actions.AdminActions;

import java.util.Scanner;

public class Admin extends User implements AdminActions {

    public Admin(){
        super();
    }

    @Override
    public boolean login(String inputUsername, String inputPassword){
        return inputUsername.equals("admin") && inputPassword.equals("admin422");
    }
    @Override
    public void displayAppMenu(){
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.println("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan){
                case  1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    System.out.println("Logout");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);

    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ADMIN");
        System.out.println("Nama: " + username);
        System.out.println("Kode Admin: " + password);
    }

    @Override
    public void manageItems() {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }
}
