package Gun09;

import java.util.Scanner;

public class _03_JavaIf {

    public static void main(String[] args) {

        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız.
        // eşit ise eşit yazdırınız

        Scanner oku1=new Scanner(System.in);
        System.out.print("Birinci sayiyi girini = ");
        int sayi1= oku1.nextInt();

        Scanner oku2=new Scanner(System.in);
        System.out.print("İkinci sayiyi giriniz = ");
        int sayi2= oku2.nextInt();

        if (sayi1>sayi2)
            System.out.println("sayi1 Büyük = " + sayi1);

        if (sayi1==sayi2)
            System.out.println("Sayılar eşit");

        if (sayi1<sayi2)
            System.out.println("sayi2 Büyük = " + sayi2);

    }

}
