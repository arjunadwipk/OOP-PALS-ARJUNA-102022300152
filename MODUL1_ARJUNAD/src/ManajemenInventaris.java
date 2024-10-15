// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.Scanner;
import java.util.ArrayList;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    Arraylist <MakananBasah> daftarMakananBasah = new ArrayList<>();
    Arraylist <MakananKering> daftarMakananKering = new ArrayList<>();

    public void tambahMakananKering() {
        
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukan Nama Makanan: ");
        String NamaMakanan = scanner.nextLine();

        System.out.print("Masukan Jumlah Makanan: ");
        int JumlahMakanan = scanner.nextInt();

        System.out.print("Masukan Harga Makanan: ");
        double HargaMakanan = scanner.nextDouble();
        
        System.out.print("Masukan Brand Makanan: ");
        String BrandMakanan = scanner.nextLine();

        // Todo : Create a new object for MakananKering
        MakananKering Kering = new MakananKering(NamaMakanan, JumlahMakanan, HargaMakanan, BrandMakanan);
        daftarMakananKering.add(Kering);

        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.print("Makanan Kering Berhasil Ditambahkan")
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukan Nama Makanan: ");
        String NamaMakanan = scanner.nextLine();

        System.out.print("Masukan Jumlah Makanan: ");
        int JumlahMakanan = scanner.nextInt();

        System.out.print("Masukan Harga Makanan: ");
        double HargaMakanan = scanner.nextDouble();
        
        System.out.print("Masukan Bahan Makanan: ");
        String BahanMakanan = scanner.nextLine();
        // Todo : Create a new object for MakananBasah
        MakananBasah Basah = new MakananBasah(NamaMakanan, JumlahMakanan, HargaMakanan, BahanMakanan);
        daftarMakananBasah.add(Basah);

        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.print("Makanan Basah berhasil ditambahkan")
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.print("Tidak Ada makanan disini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for 
            }
            // Todo : Create print notification for  Makanan Basah
            for 
            }
        }
    }
}
