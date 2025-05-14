import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tigaDigitNIM = "422";
        String Nama = "Faizza Divana";
        String Nim = "202410370110422";

        System.out.println("Pilih login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pil = scanner.nextInt();
        scanner.nextLine();

        if (pil == 1) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (username.equals("Admin" + tigaDigitNIM) && password.equals("password" + tigaDigitNIM)) {
                System.out.println("Login admin berhasil");
            } else {
                System.out.println("Login gagal");

            }

        } else if (pil ==2) {
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();

            if (nama.equals("Faizza Divana") && nim.equals("202410370110422")) {
                System.out.println("Login mahasiswa berhasil");
            } else {
                System.out.println("Login gagal");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

    }
}