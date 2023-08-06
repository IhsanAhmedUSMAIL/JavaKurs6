package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        // Günün sorusu : 3x2 lik bir diziyi kullanıcıdan sayı alarak
        // dolsurduktan sonra sadece tek elemanlarını tek boyutlu bir
        // diziye atayınız

        Scanner oku = new Scanner(System.in);

        int tekSayi=0;

        int[][] tablo = new int[3][2]; // 3 satır 2 sütun

        // okuma işlemi yapıldı, tablonun tüm hücreleri sayı ile dolduruldu
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                System.out.print("Sayı giriniz = ");
                tablo[satir][sutun] = oku.nextInt();

                if (tablo[satir][sutun] % 2 ==1)
                    tekSayi++;
            }
        }
        int[] tekler=new int[tekSayi]; // teklerin miktarı kadar bir dizi tanımlandı

        int teklerIndex=0;
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                if (tablo[satir][sutun] %2 ==1){
                    tekler[teklerIndex]=tablo[satir][sutun];
                    teklerIndex++;
                }
            }
        }
        System.out.println(Arrays.toString(tekler));
    }
}
