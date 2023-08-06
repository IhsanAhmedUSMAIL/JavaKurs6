package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {

        // kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);

        int[] sayi=new int[7];
        int toplam=0;
        int ortBuyukVeTekSayi=0;


        for (int i = 0; i < 7; i++) {
            System.out.print((i+1)+".Sayi giriniz = ");
            sayi[i] =oku.nextInt();

            toplam=toplam+sayi[i];
        }

        double ortamala=(double) toplam/sayi.length;

        for (int i = 0; i <= 7; i++) {
            if (i>ortamala && i%2!=0)
                ortBuyukVeTekSayi++;

        }

        System.out.println("Ortalamadan Büyük vetek sayi = " + ortBuyukVeTekSayi);

        }



    }


