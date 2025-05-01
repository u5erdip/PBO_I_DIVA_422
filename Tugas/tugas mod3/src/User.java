class User{ //superclass
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void setNama(String nama){ //memasukkan sebuah nilai
        this.nama = nama;
    }
    public String getNama(){ //mengambil
        return nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNim(){
        return nim;
    }

    public boolean login (String input1, String input2){
        return false;
    }
    public void displayInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

}