import java.util.Scanner;

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
            String usn = scan.nextLine();
            System.out.print("Masukkan Password: ");
            String pass = scan.nextLine();

            //objek
            Admin admin = new Admin(usn, pass);

            if (admin.login(usn, pass)) {
                admin.displayInfo();
            } else {
                System.out.println("Login Gagal!");
            }
        } else if (pil == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scan.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scan.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nama, nim);

            if (mahasiswa.login(nama, nim)) {
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