package Gun39._03_Soru;

public class kedi extends Hayvan{// miras alırken borçları (boş metod) ile beraber alıyorsun
    public kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("mama ve balık yer");
    }

    @Override
    void yemekMiktari() {
        System.out.println("100 gr");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("16 saat");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }
}
