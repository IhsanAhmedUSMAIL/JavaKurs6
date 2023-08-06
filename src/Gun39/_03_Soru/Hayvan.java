package Gun39._03_Soru;

public abstract class Hayvan {

    private final int id; // field (fianlde T.C no gibi sadece bir kere değer verilebilir)
    private String isim; // field
    private boolean vahsi; // field
    private  String dogumTarihi; // field

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    // benzersiz ID olması için nesnelerden bağımsız Static oluştur

    private static int sayacID=1; // static (sen birtanesin)

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
        this.id=sayacID++; // final dediğin için ID yi sadece burda veya
        // yukarda (sayacID) atayabilirsin

    }

    @Override
    public String toString() {
        System.out.print("isimi = " + this.isim);
        System.out.print("yiyeceği = "); yiyecegi();
        System.out.print("yemek miktarı= "); yemekMiktari();
        System.out.print("uyku süresi= "); gunlukUykuSuresi();
        System.out.print("sesi= "); sesi();

        return "Hayvan:" +
                "id=" + id +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
