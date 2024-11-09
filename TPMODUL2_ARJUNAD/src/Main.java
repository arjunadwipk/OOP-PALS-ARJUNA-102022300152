public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Lili", 9, "Village Cat");
        Burung burung = new Burung("Lala", 4, "Ungu");

        System.out.println("Informasi Hewan");
        
        System.out.println();
        System.out.println("ini adalah " + kucing.nama + "!");
        kucing.suara();
        kucing.makan();
        kucing.makan("Royal Canin");
        kucing.infoHewan();
        
        System.out.println();
        System.out.println("Ini adalah " + burung.nama + "!");
        burung.suara();
        burung.makan();
        burung.makan("Toge");
        burung.infoHewan();
    }
}
