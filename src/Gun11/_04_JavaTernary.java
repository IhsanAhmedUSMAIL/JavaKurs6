package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {

    public static void main(String[] args) {

        // soru: Girilen sayı 50 den büyük ise 1, değilse 0 değerini
        // ekrana yazdırınız. Ternary operatör ile yapınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz = ");

        int sayi= oku.nextInt();

        // 1. Yöntem
        int sonuc=((sayi>50) ? 1 : 0);
        System.out.println("sonuc = " + sonuc);

        // 2. yöntem
        System.out.println((sayi>50) ? 1 : 0);


    }

}
