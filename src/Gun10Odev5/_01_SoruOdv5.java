package Gun10Odev5;

import java.util.Scanner;

public class _01_SoruOdv5 {

    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67   gibi

        Scanner oku=new Scanner(System.in);
        System.out.print("Yan yana iki sayı giriniz = ");

        String sayi=oku.nextLine();

        int ilkRakam=sayi.indexOf(" ");
        String sayi1=sayi.substring(0,ilkRakam);
        int ilkSayi=Integer.parseInt(sayi1);

        int ikinciRakam=sayi.lastIndexOf(" ");
        String sayi2=sayi.substring(ilkRakam+1);
        int ikinciSayi=Integer.parseInt(sayi2);

        System.out.println("Girilen sayılar = "+ "\n"+ilkSayi +"\n"+ ikinciSayi);


        if (ilkSayi==ikinciSayi)
            System.out.println("GİRDİĞİNİZ SAYI EŞİT");
        else
            System.out.println("GİRDİĞİNİZ SAYI EŞİT DEĞİL");




    }

}
