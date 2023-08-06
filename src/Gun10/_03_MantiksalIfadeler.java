package Gun10;

import java.util.Scanner;

public class _03_MantiksalIfadeler {

    public static void main(String[] args) {

        // mantıksan ifadeler Logic statement
        // && ve işareti -> and işareti
        // || veya işareti -> or işareti

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");

        int sayi= oku.nextInt();

        int kalan= sayi%2;

        if (kalan == 1 || kalan==-1)  // 1 veya -1 iken çalışıyor
            System.out.println("tek");
        else
            System.out.println("çift");

    }

}
