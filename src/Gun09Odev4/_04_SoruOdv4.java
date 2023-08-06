package Gun09Odev4;

import java.util.Scanner;

public class _04_SoruOdv4 {

    public static void main(String[] args) {

        // Kullanıcıdan 2 kere şifresini isteyiniz, aynı ise TAMAM, değil ise HATALI şifre yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifre giriniz = ");

        String sifre1=oku.nextLine();

        System.out.print("Tekrar giriniz = ");

        String sifre2=oku.nextLine();

        if (sifre1.equals(sifre2))
            System.out.println("TAMAM");

        if (!sifre1.equals(sifre2))
            System.out.println("HATALI");




    }

}
