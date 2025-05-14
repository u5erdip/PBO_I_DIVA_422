import java.util.Scanner;

class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    RekeningBank(String nr, String np, double s) {
        nomorRekening = nr;
        namaPemilik = np;
        saldo = s;
    }

    void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
        System.out.println();
    }
        void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp " + jumlah);
        System.out.println("Saldo sekarang: Rp " + saldo);
        System.out.println();
    }

    void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp " + jumlah);
            System.out.println("Saldo baru: Rp " + saldo);
        } else {
            System.out.println(namaPemilik + " menarik Rp " + jumlah);
            System.out.println("Saldo tidak mencukupi");
            System.out.println("Saldo sekarang: Rp " + saldo);
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RekeningBank rekening1 = new RekeningBank("202410370110422", "Faizza Divana", 500000);
        RekeningBank rekening2 = new RekeningBank("202410370110437", "Azzah Rafidah", 300000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        System.out.print("Masukkan jumlah setoran untuk " + rekening1.namaPemilik + ": Rp ");
        double setor1 = scanner.nextDouble();
        rekening1.setorUang(setor1);

        System.out.print("Masukkan jumlah penarikan untuk " + rekening2.namaPemilik + ": Rp ");
        double tarik2 = scanner.nextDouble();
        rekening2.tarikUang(tarik2);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
