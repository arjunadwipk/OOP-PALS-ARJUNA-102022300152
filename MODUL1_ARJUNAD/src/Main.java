// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
        ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();


        // Todo : Create Loop list menu
        Scanner scanner = new Scanner(System.in);
        System.out.print("   Menu Inventaris makanan EAD   ");
        System.out.print("1.          Tambah Makanan Basah ");
        System.out.print("2.         Tambah Makanan Kering ");
        System.out.print("3.       Tampilkan Semua Makanan ");
        System.out.print("4.                        Keluar ");
        System.out.print("Masukan Menu yang akan dipilih: ");
        int menu = scanner.nextInt();

        switch (scanner) {
            case 1:
                Makanan tambahMakananBasah();
            case 2:
                Makanan tambahMakananKering();
            case 3:
                Makanan tampikanSemuaMakanan();
            case 4:
                break;
                System.out.println("Terima Kasih Sudah Menggunakan Program");
            
        
            default:
            System.out.println("Menu Tidak Tersedia");

        }

    }
}
