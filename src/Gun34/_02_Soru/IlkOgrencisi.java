package Gun34._02_Soru;

public class IlkOgrencisi extends  Ogrenci {

    private String klup;

    public IlkOgrencisi(String isim, String klup) {
        //super(isim, tipi); bir üst satırdan  OgrTip tipi silip devamındaki komutu alttaki
        // gibi yazabiliriz. mainden de  OgrTip.ILK komutunu silebiliriz.
        super(isim,OgrTip.ILK);

        setKlup(klup);
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return super.toString()+", klup="+this.klup;
    }
}
