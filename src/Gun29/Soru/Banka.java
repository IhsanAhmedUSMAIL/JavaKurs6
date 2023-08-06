package Gun29.Soru;

public class Banka {

    public static void main(String[] args) {

        Musteri mus1=new Musteri();
        mus1.musteriNo=1;
        mus1.ad="Ihsan";
        mus1.soyad="USMAIL";

        mus1.musteriHesabi.paraYatir(100);
        mus1.musteriHesabi.paraYatir(200);
        mus1.musteriHesabi.paraCek(50);

        System.out.println("mus1 = " + mus1.musteriHesabi);

        // mus1.musteriHesabi.bakiye=10000000; private olduğu için kendimiz yatıramadık.

    }
}
