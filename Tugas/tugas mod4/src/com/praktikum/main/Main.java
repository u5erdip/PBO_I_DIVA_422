package com.praktikum.main;

import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contoh: kita login sebagai Mahasiswa
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        // Polymorphism: objek User bisa menunjuk ke Mahasiswa atau Admin
        User user = new Mahasiswa(); // atau new Admin(nama, nim);

        if (user.login(nama, nim)) {
            System.out.println("Login berhasil!\n");
            user.displayAppMenu();

        } else {
            System.out.println("Login gagal. Periksa kembali nama dan NIM.");
        }

        scanner.close();
    }
}