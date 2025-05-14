import java.util.Scanner;

class Admin {
    String username;
    String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //method
    public boolean login() {
        return username.equals("Admin422") && password.equals("pass422");
    }
}

class Mahasiswa {
    String nama;
    String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public boolean login() {
        return nama.equals("Diva") && nim.equals("422");
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pilih Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan: ");
        int pil = scan.nextInt();
        scan.nextLine();

        if (pil == 1) {
            System.out.print("Masukkan Username: ");
            String username = scan.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scan.nextLine();

            //objek
            Admin admin = new Admin(username, password);

            if (admin.login()) {
                System.out.println("Login Berhasil sebagai Admin!");
            } else {
                System.out.println("Login Gagal!");
            }
        } else if (pil == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scan.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scan.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nama, nim);

            if (mahasiswa.login()) {
                System.out.println("Login Berhasil sebagai Mahasiswa!");
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login Gagal!");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scan.close();
    }
}