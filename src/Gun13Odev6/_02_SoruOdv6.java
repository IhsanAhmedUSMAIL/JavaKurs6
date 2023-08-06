package Gun13Odev6;

import java.util.Scanner;

public class _02_SoruOdv6 {

    public static void main(String[] args) {

        //2- Kullanıcnın gireceği 6 sayıdan kaç tanesinin tek olduğunu bulunuz

        Scanner oku=new Scanner(System.in);

        int sayac=1;
        int tekSayi=0;

        while (sayac<=6) {
            System.out.print("Sayı giriniz = ");
            int sayi= oku.nextInt();

            if (sayi%2!=0) {
                tekSayi++;

                 } sayac++;
        }
        System.out.println("Tek sayı = " + tekSayi);
    }

}
