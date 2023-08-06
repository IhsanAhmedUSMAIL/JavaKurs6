package Gun13;

import java.util.Scanner;

public class _02_Switch {

    public static void main(String[] args) {

        // Girilen bir sayının birler basamağının değerini yazı ile yazdırınız.
        // 234 -> birler basamağı -> 4 dört (2: yüzler basamağı, 3: onlar basamağı, 4: birler basamağı )

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz = ");

        int sayi=oku.nextInt();

        int sonSayi=sayi%10; // % Modül her zaman kalanı verir yani ondalığı verir

        switch (sonSayi) {
            case 0: System.out.println("SIFIR"); break;
            case 1: System.out.println("BİR"); break;
            case 2: System.out.println("İKİ"); break;
            case 3: System.out.println("ÜÇ"); break;
            case 4: System.out.println("DÖRT"); break;
            case 5: System.out.println("BEŞ"); break;
            case 6: System.out.println("ALTI"); break;
            case 7: System.out.println("YEDİ"); break;
            case 8: System.out.println("SEKİZ"); break;
            case 9: System.out.println("DOKUZ"); break;



        }


        }


    }


