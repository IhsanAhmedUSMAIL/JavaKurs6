package Gun13Odev6;

import java.util.Scanner;

public class _06_SoruOdv6 {

    public static void main(String[] args) {

        //6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //    bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //   Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //   bilemediniz yazıp tutulan sayıyı bildirsin.
        //   Eğer bilirse tebrikler yazsın.

        Scanner oku=new Scanner(System.in);

        int sayac=1;

        int min=10;
        int max=20;
        int aralik= max - min + 1;
        int rndSayi=(int)(Math.random()*aralik)+min;


        while (sayac<=3)
        {
            System.out.print("Tahmin giriniz = ");
            int tahmin= oku.nextInt();

        if (tahmin==rndSayi)
            System.out.println("Tebrikler");
        else
            {
                sayac++;
            }

        }
        System.out.println("Bilemediniz, Tutulan sayı = " +rndSayi);

    }


}
