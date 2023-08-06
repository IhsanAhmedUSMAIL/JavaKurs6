package Gun12;

import java.util.Scanner;

public class _04_IfElseIf {

    public static void main(String[] args) {

        // Girilen iki tam sayıyı kullanıcıdan aldıktan sonra, toplam için
        // Toplam için T, çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan işlemi yaptırıp sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        System.out.print("1. Sayı = ");

        int Sayi1=oku.nextInt();

        System.out.print("2. Sayı = ");

        int Sayi2=oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.print("Seçiminiz = ");

        String secim=okuStr.next(); // T,Ç,P,B

        if (secim.equalsIgnoreCase("T"))
            System.out.println("Toplam = " + " " + (Sayi1+Sayi2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("Çıkarma" + " "+ (Sayi1-Sayi2));
            else
                if (secim.equalsIgnoreCase("P"))
                    System.out.println("Çarpma" + " " +(Sayi1*Sayi2));
                else
                    if (secim.equalsIgnoreCase("B"))
                        System.out.println("Bölme" + " " + ((double)Sayi1/Sayi2));
                    else
                        System.out.println("Seçiminiz yanlış");



    }

}
