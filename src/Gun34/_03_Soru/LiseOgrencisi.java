package Gun34._03_Soru;

public class LiseOgrencisi extends Ogrenci {
    private String brans;

    private static int liseSayaID=1; // Ogrenci dosyasından ortak vermemesi için ilgili komutu iptal edip bunu ekledik.


    public LiseOgrencisi(String isim, String brans) {
        //super(isim, tipi); bir üst satırdan  OgrTip tipi silip devamındaki komutu alttaki
        // gibi yazabiliriz. mainden de  OgrTip.LISE komutunu silebiliriz.
        super(isim, OgrTip.LISE,liseSayaID++);

        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return super.toString()+", branş="+this.brans;
    }
}
