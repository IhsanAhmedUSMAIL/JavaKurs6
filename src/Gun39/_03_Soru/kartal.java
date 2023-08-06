package Gun39._03_Soru;

public class kartal extends Hayvan{ // miras alırken borçları (boş metod) ile beraber alıyorsun
    public kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Et yer");

    }

    @Override
    void yemekMiktari() {
        System.out.println("Günlük 1 Kg");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("günde 8 saat");

    }

    @Override
    void sesi() {
        System.out.println("ciyat fiyuuuuu");

    }
}
