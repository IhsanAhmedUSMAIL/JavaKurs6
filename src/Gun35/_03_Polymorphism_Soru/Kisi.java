package Gun35._03_Polymorphism_Soru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public static void kimlikBelgesiYazdir(Kisi gelenKisi)
    {
        System.out.println("\n***** Kimlik Belgesi *****");
        System.out.println("Adı = " + gelenKisi.getAd());
        System.out.println("Soyadı = " + gelenKisi.getSoyad());
        System.out.println("Görevi = " + gelenKisi.getGorevi());

        if(gelenKisi instanceof Calisan)
            System.out.println("Departmanı = "+((Calisan)gelenKisi).getDepartmani());
        else
            System.out.println("Şubesi="+((Ogrenci)gelenKisi).getSubesi());

    }

    public Kisi(String ad, String soyad, String gorevi) {
       setAd(ad);
       setSoyad(soyad);
       setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }
}
