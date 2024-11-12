class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;

    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    public void Informasi() {
        super.Informasi();
        System.out.println("Status: " + (vipCard ? "Member VIP" : "Non Vip"));
        if (vipCard) {
            System.out.println("Benefit Member VIP: ");
            System.out.println("- Diskon 10% untuk bermain diatas 3 jam");
            System.out.println("- Gratis Minuman setiap bermain diatas 4 jam");
            System.out.println("- Prioritas Booking Komputer Gaming");
        }

        else {
            System.out.println("Jangan Ngarep Benefit");
        }
            
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login (String Username) {
        System.out.println("Login dengan Ussername: ");
    }

    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam) {
        System.out.println("Bermaimn selama: "+ jam + "Jam");
    }
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menitTambahan) {
        System.out.println("Tambah Billing: "+ jam +"Jam" + menitTambahan + "Menit");
    }
}