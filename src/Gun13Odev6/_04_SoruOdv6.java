package Gun13Odev6;

import java.util.Scanner;

public class _04_SoruOdv6 {

    public static void main(String[] args) {

        //4- Kullanıcının gireceği 6 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner oku=new Scanner(System.in);

        int sayac=1;
        int toplam=0;

        while (sayac<=6) {
            System.out.print("Bir sayı giriniz = ");
            int sayi= oku.nextInt();

            if (sayi>=10 && sayi<=30)
            {
                toplam=toplam+sayi;
            }
                  sayac++;
        }
        System.out.println("toplam = " + toplam);
    }

}
