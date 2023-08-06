package Gun13Odev6;

import java.util.Scanner;

public class _01_SoruOdv6 {

    public static void main(String[] args) {

        //1- Kullanıcının gireceği 6 sayıdan tek olanlarının toplamını bulunuz

        Scanner oku=new Scanner(System.in);

        int sayac=1;
        int toplam=0;

        while (sayac<=6)
        {
            System.out.print(sayac + " "+"Sayı giriniz = ");
            int sayi= oku.nextInt();
            if (sayi%2!=0) {
                toplam = toplam + sayi;
            }
            sayac++;

        }
        System.out.println("toplam = " + toplam);
    }

}
