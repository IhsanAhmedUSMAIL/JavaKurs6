package Gun16;

import java.util.Scanner;

public class _03_JavaArray {
    public static void main(String[] args) {

        // 5 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırınız.

        Scanner oku=new Scanner(System.in);
        int [] not=new int[5]; // Hafızada 5 tane int kutusu oluşturuldu.
        int toplam=0;
        int gecenler=0;

        for (int i = 0; i < not.length; i++) {
            System.out.print((i+1)+".not giriniz = ");
            not[i]= oku.nextInt();

            toplam=toplam+not[i];
        }


        double ortalama=(double) toplam/not.length;


        for (int i = 0; i < 5; i++) {
            if (not[i] >= ortalama){
                System.out.println("geçen not = " + not[i]);
                gecenler++;
            }

        }

        System.out.println("ortalama = " + ortalama);
        System.out.println("Geçenler = " + gecenler);

    }
}
