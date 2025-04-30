package perpustakaan;

public class Anggota implements Peminjaman {
    String nama;
    String idAnggota;

    public Anggota(String nama, String idAnggota){
        this.nama = nama;
        this.idAnggota = idAnggota;
    }


    @Override
    public void pinjamBuku() {
        System.out.println("Anggota: " + nama + " (ID: "+ idAnggota + ")");

    }
    public void pinjamBuku(String judulBuku){
        System.out.println(nama + " meminjam buku berjudul: " + judulBuku) ;

    }
    public void pinjamBuku(String judulBuku, String durasipeminjaman){
        System.out.println(nama + " meminjam buku berjudul: " + judulBuku + "selama"+ durasipeminjaman) ;

    }

    @Override
    public void kembalikanBuku(String judulbuku) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judulbuku) ;

    }
}
