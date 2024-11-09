public class Burung extends Hewan {
    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    public void suara() {
        System.out.println(nama + " Kaka Tua");
    }

    public void infoHewan() {
        super.infoHewan();
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}
