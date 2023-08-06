package Gun10;

import java.util.Scanner;

public class _00_JavaIf {

    public static void main(String[] args) {

        // kullanıcıdan 2 kez gireceği şifresini AYNI veya DEĞİL şekinde cevaplayınız (confirm new password)

        Scanner strgoku=new Scanner(System.in);
        System.out.print("Şifre giriniz = "); // karakter, sayı, harf olabildiği için string ile okutacağız

        String sifre1= strgoku.nextLine(); // String olduğu zaman sadece odalarını (hafızadaki yeri) karşılaştırıyor

        System.out.print("Şifrenizi tekrar giriniz = ");
        String sifre2=strgoku.nextLine();

        // ****** Eşitlemede String görürsek her zaman EQUALS kullanacağız
        // 1. BİLDİĞİMİZ YÖNTEM - stringlerde hafızadaki yerlerini kontrol ettiği için bunu kullanamıyoruz
        if (sifre1==sifre2)
            System.out.println("AYNI");

        // olması gereken string ifadelerde bu iş için yapılmış olan içerik karşılaştırıcı olan EQUALS kullanılmalı.

        if (sifre1.equals(sifre2) == true)
            System.out.println("DOĞRU");

        if (sifre1.equals(sifre2) == false)
            System.out.println("DEĞİL");

        if (sifre1.equals(sifre2))
            System.out.println("DOĞRU");

        if (!sifre1.equals(sifre2))
            System.out.println("DEĞİL");

    }

}
