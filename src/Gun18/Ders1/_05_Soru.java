package Gun18.Ders1;

import java.util.Scanner;

public class _05_Soru {

    public static void main(String[] args) {

        // 2x3 lük bir diziyi random 10 a kadar sayılarla doldurunuz.
        // Daha sonra kullanıcıdan bir sayı alınız. Bu sayı tabloda
        // var ise yerini (satır, sütun) yazdırınız

        // Tabloyu random 10 e kadar sayılarla doldurmak için
        int[][] tablo = new int[2][3];
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                tablo[satir][sutun] = (int) (Math.random() * 10); // 10 dahil değil

            }
        // tabloyu yazdırmak için

            for (int satir = 0; satir < tablo.length; satir++) {
                for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                    System.out.print(tablo[satir][sutun] + " ");
                    ; // 10 dahil değil

                    System.out.println();

                }


                Scanner oku = new Scanner(System.in);
                System.out.print("10 a kadar tahmini bir sayı giriniz = ");

                int arananSayi1 = oku.nextInt();

                // yazdırma

            for (int satir = 0; satir < tablo.length; satir++) {
                for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                  if (tablo[satir][sutun] == arananSayi1)
                      System.out.println("Satır =" + satir + ", Sütun =" + sutun);


            }

        }
    }


