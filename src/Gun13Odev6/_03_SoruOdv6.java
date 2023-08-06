package Gun13Odev6;

import java.util.Scanner;

public class _03_SoruOdv6 {

    public static void main(String[] args) {

        //3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");

        int sayi = oku.nextInt();

        int sayac = 1;
        int toplam = 0;

        while (sayac <= sayi){

            toplam=toplam+sayac;
            sayac++;
        }

        System.out.println("toplam = " + toplam);

    }

}
