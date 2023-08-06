package Gun07Odev3;

import java.util.Scanner;

public class _18_SoruOdv3 {

    public static void main(String[] args) {

        // tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını     ayrı ayrı yazdırınız.
        //      mesala : Mehmet Alı Yılmaz -> Mehmet  i  Ali  yi ve Yılmaz ı ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("3 kelimelik isim giriniz = ");

        String fulAd=oku.nextLine();

        int ilkAd=fulAd.indexOf(" ");
        String ad=fulAd.substring(0,ilkAd+1);

        System.out.println("ad = " + ad);

        int ikinciAd=fulAd.lastIndexOf(" ");
        String babaAdi=fulAd.substring(ilkAd+1,ikinciAd);

        System.out.println("Baba Adı = " + babaAdi);

        String soyAd=fulAd.substring(ikinciAd+1);
        System.out.println("soyAd = " + soyAd);





    }

}
