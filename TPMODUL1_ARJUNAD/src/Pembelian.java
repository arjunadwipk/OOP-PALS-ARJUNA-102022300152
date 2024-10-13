import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    private static Penumpang penumpang = null;
    private static Penerbangan penerbanganpilihan = null;

    public static void main(String[] args) {
        ArrayList<Penerbangan> listpenerbangan = new ArrayList<>();
        listpenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        listpenerbangan.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n====== EAD Ticket Booking System ======");
            System.out.println("1. Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarPenerbangan(listpenerbangan);
                    break;
                case 2:
                    pesanTiket(input, listpenerbangan);
                    break;
                case 3:
                    tampilkanPesanan();
                    break;
                case 4:
                    System.out.println("Terima kasih sudah memakai program ini :)");
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }
    }

    private static void tampilkanDaftarPenerbangan(ArrayList<Penerbangan> listpenerbangan) {
        System.out.println("\n===== Daftar Penerbangan =====");
        for (int i = 0; i < listpenerbangan.size(); i++) {
            System.out.println((i + 1) + ". ");
            listpenerbangan.get(i).tampilkanPenerbangan();
        }
    }

    private static void pesanTiket(Scanner input, ArrayList<Penerbangan> listpenerbangan) {
        System.out.println("\nIsi Data diri anda");
        System.out.print("Masukkan NIK: ");
        String NIK = input.next();
        
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = input.next();
        
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = input.next();
        
        penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
        System.out.println("\nData Diri sudah ditambahkan.");
        
        tampilkanDaftarPenerbangan(listpenerbangan);
        
        System.out.print("Pilih nomor penerbangan: ");
        int pilihanPenerbangan = input.nextInt();
        
        if (pilihanPenerbangan > 0 && pilihanPenerbangan <= listpenerbangan.size()) {
            penerbanganpilihan = listpenerbangan.get(pilihanPenerbangan - 1);
            System.out.println("\nPTiket berhasil dipesan");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    private static void tampilkanPesanan() {
        if (penumpang == null || penerbanganpilihan == null) {
            System.out.println("\nAnda belum memesan tiket");
        } else {
            System.out.println("\n===== Detail Tiket =====");
            penumpang.tampilkanPenumpang();
            penerbanganpilihan.tampilkanPenerbangan();
        }
    }
}
