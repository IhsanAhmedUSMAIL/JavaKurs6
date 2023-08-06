package Gun38._01_Abstract;

//2 si bir arada => 1 interface+1 parent class = abstract class
public abstract class BinekOto { // PARENT CLASS

    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    // sadece bir class ve interface kullanıyorsan ve hibrit gibi
    // komplike durum yoksa
    // ekstradan interface dosyası oluşturmaya gerek kalmadan
    // alttaki gibi abstract ile yapılacak metod listesi oluşturabilirsin
    // yukarıya da abstract eklemeyi unutma
    abstract int hizlanmaSuresi(); // hem inheritance parent class hem de
    // interface olarak görev görüyor.


    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdedi(vitesAdedi);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
