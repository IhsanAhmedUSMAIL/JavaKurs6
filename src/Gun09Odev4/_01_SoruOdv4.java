package Gun09Odev4;

import java.util.Scanner;

public class _01_SoruOdv4 {

    public static void main(String[] args) {

        // Girilen bir sayının birler basamağını tek olup olmadığını ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");

        int sayi= oku.nextInt();

        int sonSayi=sayi%10;

        if (sonSayi%2==1)
            System.out.println("TEK");






    }

}
