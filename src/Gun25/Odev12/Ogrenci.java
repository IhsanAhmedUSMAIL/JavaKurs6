package Gun25.Odev12;

public class Ogrenci {

    int okulNo;
    String tamAdi;
    int notu;

    public Ogrenci(int okulNo, String tamAdi, int notu) {

        this.okulNo = okulNo;
        this.tamAdi = tamAdi;
        this.notu = notu;

    }

    public int getOkulNo() {
        return okulNo;
    }

    public String getTamAdi() {
        return tamAdi;
    }

    public int getNotu() {
        return notu;
    }

}
