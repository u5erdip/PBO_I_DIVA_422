package app;

import perpustakaan.Anggota;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;

public class main {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Diva", " 422 ");
        Anggota anggota2 = new Anggota("Rafidah", " 437 ");
        Fiksi bukuFiksi = new Fiksi("Perahu Kertas", "Dewi Lestari");
        NonFiksi nonFiksi = new NonFiksi("Madilog", "Tan Malaka");

        nonFiksi.displayInfo();
        bukuFiksi.displayInfo();

        anggota1.pinjamBuku("Perahu Kertas");
        anggota2.pinjamBuku("Madilog");
        anggota1.kembalikanBuku("Peraahu Kertas");
        anggota2.kembalikanBuku("Madilog");




    }
}
