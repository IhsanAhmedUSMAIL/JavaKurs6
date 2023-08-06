package Tekrar;

import java.util.Scanner;

public class _01_GenelGirisKonulari {

    public static void main(String[] args) {

        System.out.println(); // out ekrana yaz
        // ln yazdıktan sonra bir alt satıra geç demek.

        // sayı, karakte, kelime saklamak için
        int sayi=5; // tam sayi saklayacak
        String cumle="Bugün ek çalışma var"; // kelime veya cümle saklayabiliriz
        // double, char, long, byte, float, short

          double ortalama=30.5;

        ortalama=sayi; // küçük bir alanı, büyük alana atıyorsan bir problem olmaz.
        sayi=(int)ortalama; // büyük olanı; küçük olana atıyordun dikkat veri kaybı olabilir. Bilerek yaparsan (int) olarak belirle

        // kullanıcıdan veri nasıl alınır
        Scanner okuyucu=new Scanner(System.in); // okuyucu

        System.out.print("Sayi giriniz=");
        int okunanSayi=okuyucu.nextInt(); // ekrandan sayı oku sayı olarak ver.
        System.out.println("okunanSayi = " + okunanSayi);

        Scanner okuStr=new Scanner(System.in);
        System.out.print("Cumle=");
        String okunanCumle=okuStr.nextLine();
        System.out.println("okunanCumle = " + okunanCumle);



    }

}
