package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user;

        System.out.println("=== Sistem Login ===");
        System.out.print("Login sebagai (1. Admin, 2. Mahasiswa): ");
        int role = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        String input1, input2;


        // Inisialisasi objek sesuai role
        if (role == 1) {
            user = new Admin();
            System.out.print("Username: ");
            input1 = scanner.nextLine();
            System.out.print("Password: ");
            input2 = scanner.nextLine();
        } else if (role == 2) {
            user = new Mahasiswa();
            System.out.print("Nama: ");
            input1 = scanner.nextLine();
            System.out.print("NIM: ");
            input2 = scanner.nextLine();
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        boolean berhasilLogin = user.login(input1, input2);
        // Login
        if (berhasilLogin) {
            System.out.println("Login berhasil sebagai " + user.getClass().getSimpleName());
            user.displayAppMenu(); // poly
        } else {
            System.out.println("Login gagal.");
        }
    }
}
