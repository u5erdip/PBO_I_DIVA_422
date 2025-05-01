class Admin extends User { //subclass dari user
    String usn;
    String pass;
    public Admin(String nama, String nim){
        super(nama, nim);
        this.usn = usn;
        this.pass = pass;
    }

    @Override
    public boolean login(String usn, String pass) {
        return usn.equals("Admin422") && pass.equals("pass422");
    }
    @Override
    public void displayInfo(){
        System.out.println("Login Admin berhasil");
        // super.displayInfo();
    }
}
//boolean
//