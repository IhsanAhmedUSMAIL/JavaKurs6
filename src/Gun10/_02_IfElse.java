package Gun10;

import java.util.Scanner;

public class _02_IfElse {

    public static void main(String[] args) {

        // Girinel bir sayının tek mi çift mı olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");

        int sayi= oku.nextInt();

        int kalan= sayi%2; // çiftlerde her zaman sıfır kalır 0(2,4,6 -2, -6,) negatif veya pozitif farketmez
                           // teklerde ise 1 (1,3,5) veya -1 (-1,-3,-5,-7 .... )

        if (kalan == 0)
            System.out.println("ÇİFT SAYİ");
        else // 0 değilken yani 1 veya -1 durumunda
            System.out.println("TEK SAYI");

    }

}
