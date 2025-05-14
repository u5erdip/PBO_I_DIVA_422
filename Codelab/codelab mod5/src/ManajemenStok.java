import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManajemenStok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Barang> daftarBarang = new ArrayList<>();

        daftarBarang.add(new Barang("Handphone", 50));
        daftarBarang.add(new Barang("Laptop", 60));


        while (true) {
            System.out.println("\n===== Menu Manajemen Stock =====");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");

            System.out.print("Masukkan Pilihan: ");

            int pilihan;
            try {
                pilihan = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input pilihan harus berupa angka!");
                scan.nextLine();
                continue;
            }

            if (pilihan == 1) {
                System.out.print("Masukkan nama barang: ");
                String nama = scan.nextLine();

                try {
                    System.out.print("Masukkan stok barang: ");
                    int stok = scan.nextInt();
                    scan.nextLine();

                    Barang barangBaru = new Barang(nama, stok);
                    daftarBarang.add(barangBaru);
                    System.out.println("Barang berhasil ditambahkan.");
                } catch (InputMismatchException e) {
                    System.out.println("Stok harus berupa angka!");
                    scan.nextLine();
                }

            } else if (pilihan == 2) {
                if (daftarBarang.isEmpty()) {
                    System.out.println("Stok barang kosong.");
                } else {
                    System.out.println("--- Daftar Barang ---");
                    for (Barang b : daftarBarang) {
                        System.out.println("- " + b.getNama() + " (Stok: " + b.getStok() + ")");
                    }
                }

            } else if (pilihan == 3) {
                if (daftarBarang.isEmpty()) {
                    System.out.println("Stok barang kosong.");
                    continue;
                }

                System.out.println("Pilih Barang");
                for (int i = 0; i < daftarBarang.size(); i++) {
                    System.out.println(i + ". " + daftarBarang.get(i).getNama()
                            + " (Stok: " + daftarBarang.get(i).getStok() + ")");
                }

                try {
                    System.out.print("Masukkan indeks barang: ");
                    int indeks = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Masukkan jumlah yang ingin dikurangi: ");
                    int jumlah = scan.nextInt();
                    scan.nextLine();

                    Barang barang = daftarBarang.get(indeks);
                    if (jumlah > barang.getStok()) {
                        throw new StokTidakCukupException("Stok untuk " + barang.getNama()
                                + " hanya tersisa " + barang.getStok());
                    }

                    barang.setStok(barang.getStok() - jumlah);
                    System.out.println("Stok berhasil dikurangi.");
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka!");
                    scan.nextLine();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Indeks tidak valid.");
                } catch (StokTidakCukupException e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } else if (pilihan == 0) {
                System.out.println("Terima kasih!");
                break;

            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
        }

        scan.close();
    }
}