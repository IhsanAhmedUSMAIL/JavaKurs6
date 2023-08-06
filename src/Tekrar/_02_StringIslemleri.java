package Tekrar;

import java.util.Scanner;

public class _02_StringIslemleri {

    public static void main(String[] args) {
                      //            1111111
                      //  01234567890123456
            String cumle="Bu gün hava güzel";
        System.out.println("cumle.length() = " + cumle.length());  // index yani oda numarası

        System.out.println("cumle.charAt(1) = " + cumle.charAt(1)); // u (1. odadaki harf)

        System.out.println("cumle.indexOf(u) = " + cumle.indexOf("u")); //1 , U nun oda numarası

        System.out.println("cumle.contains(u) = " + cumle.contains("u")); // boolean değişkeni

        Scanner oku=new Scanner(System.in);
        System.out.print("şifre giriniz = ");
        String sifre=oku.next();

        System.out.print("Şifre tekrar");
        String sifreTekrar= oku.next(); // genelde boşluk falan olmadığı için saece next kullandık. next boşluğa kadar okur

        sifre.equals(sifreTekrar); // şifre tekrar şifreye eşit mi

        Boolean esitMi=sifre.trim().equals(sifreTekrar.trim());// şifre, tekrar şifre
        System.out.println("esitMi = " + esitMi);

        sifre="merhaba";
        String aranan1="m";
        String aranan2="M";
        sifre.contains(aranan1);
        sifre.contains(aranan2);

        Boolean varMi=sifre.toLowerCase().contains(aranan2.toLowerCase()); // true
        System.out.println("varMi 1 = " + varMi);

        varMi=sifre.toUpperCase().contains(aranan2.toUpperCase()); // true
        System.out.println("varMi 2 = " + varMi);

    }

}
