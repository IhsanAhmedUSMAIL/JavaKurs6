package Gun30._04_Soru;

import java.util.Scanner;

public class soruMain {
    public static void main(String[] args) {

        int gun = 0;
        int saat = 0;
        int dak = 0;

        Scanner oku = new Scanner(System.in);
        System.out.print("Gün=");
        gun = oku.nextInt();
        System.out.print("Saat=");
        saat = oku.nextInt();
        System.out.print("Dakika=");
        dak = oku.nextInt();

        int toplamSaniye =
                gun
                        * Sabitler.gunSaat
                        * Sabitler.saatDakika
                        * Sabitler.dakikaSaniye
                        +
                        saat
                                * Sabitler.saatDakika
                                * Sabitler.dakikaSaniye
                        +
                        dak
                *Sabitler.dakikaSaniye;

        System.out.println("Toplam Saniye = " + toplamSaniye);

        //2. yöntem
        System.out.println("Toplam Saniye = " + Sabitler.hesapla(gun,saat,dak));


    }

}
