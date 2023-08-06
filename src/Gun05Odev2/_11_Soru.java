package Gun05Odev2;

import java.util.Scanner;

public class _11_Soru {

    public static void main(String[] args) {

        //11-Kullanıcdan alacağınız 3 öğrenci ders notunun ortalamasını ekrana yazdırınız.

        Scanner not1=new Scanner(System.in);
        System.out.print("Ogrenci 1 =");
        double ogrenci1= not1.nextDouble();

        Scanner not2=new Scanner(System.in);
        System.out.print("Ogrenci 2 =");
        double ogrenci2= not2.nextDouble();

        Scanner not3=new Scanner(System.in);
        System.out.print("ogrenci 3 =");
        double ogrenci3=not3.nextDouble();

        double toplam=ogrenci1+ogrenci2+ogrenci3;
        double ortalama= toplam/3;

        System.out.println("ortalama = " + ortalama);


    }

}
