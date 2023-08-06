package Gun11;

import java.util.Scanner;

public class _01_Soru {

    public static void main(String[] args) {

        // yan yana aralarında bir boşluk girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner oku=new Scanner(System.in);

        System.out.print(" Aralarında bir boşluk ile iki sayı giriniz = ");

        String sayilar=oku.nextLine();
        int boslukIndex=sayilar.indexOf(" ");
        String strSayi1=sayilar.substring(0,boslukIndex); // 45 sayi görünümlü string
        String strSayi2=sayilar.substring(boslukIndex+1); // 67 sayi görünümlü string

        int sayi1=Integer.parseInt(strSayi1); // 45 sayı oldu
        int sayi2=Integer.parseInt(strSayi2); // 67 sayı oldu

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        if (sayi1==sayi2)
            System.out.println("EŞİT");
        else
            System.out.println("EŞİT DEĞİL");



    }

}
