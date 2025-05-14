package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    public Mahasiswa() {
        super();
    }

    @Override
    public boolean login(String inputNama, String inputNim){
        return inputNama.equals("Diva") && inputNim.equals("422");
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=== Menu Mahasiswa ===");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportItem();
                    break;
                case 0:
                    System.out.println("Logout...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }



    @Override
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.println("Deskripsi Barang: ");
        String deskripsi = scanner.nextLine();
        System.out.println("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();
        System.out.println(">> Laporan berhasil dikirim!! <<");
    }

    @Override
    public void viewReportItem() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }
}
