package Gun28._05_Ornek;

public class EnerjiSA {

    public static void main(String[] args) {

        Musteri mus1= new Musteri("Ihsan");

            mus1.elektrikHesabi.tuketimEkle(50);
            mus1.elektrikHesabi.tuketimEkle(60);
            mus1.elektrikHesabi.tuketimEkle(70);

        System.out.println("Toplam  tüketim = " +mus1.elektrikHesabi.toplamTuketim);

        mus1.elektrikHesabi.faturaYaz();

    }

}
