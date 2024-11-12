class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    public void Informasi() {
        super.Informasi();
        System.out.println("Status: " + (ruangPrivat ? "Ruang Premium" : "Ruang Standar"));
        if (ruangPrivat) {
            System.out.println("====== Informasi Komputer ======");
            System.out.println("- Ruangan Ber-AC pribadi");
            System.out.println("- Sofa Gaming Exclusive");
            System.out.println("- Komputer Spesifikasi Tinggi");
            System.out.println("- Koneksi Internet Dedicated 100Mbps");
        }
         else {
            System.out.println("Fasilitas Ruang Standar");
            System.out.println("- Ruang Gerah");
            System.out.println("- Sofa Majapahit");
            System.out.println("- Komputer Spesifikasi rendah");
            System.out.println("- Internet Dedicated 1Mbps");
         }
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor: " + nomorKomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void tambahLayanan (String makanan) {
        System.out.println("Menambah Layanan Makanan: " + makanan);
    }   
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void tambahLayanan (String makanan, String minuman) {
        System.out.println("Menambah Layanan Makanan: "+ makanan+ "dan Minuman: "+ minuman);
    }
}
