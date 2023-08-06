package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {

        // kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra.
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız



        Scanner oku=new Scanner(System.in);

        int[] dizi= new int[5];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı giriniz = ");
           dizi[i]= oku.nextInt();
        }
        System.out.println(Arrays.toString(dizi));
        enKucuk(dizi);
        enBuyuk(dizi);
        ortalama(dizi);

    }
    public static void enBuyuk(int[] dizi)
    {

        Arrays.sort(dizi); // küçükten büyüğe sıraladı
        System.out.println("En büyük =" + dizi[dizi.length-1]); // sondakini verir

    }
    public static void enKucuk(int[] dizi)
    {

        Arrays.sort(dizi);
        System.out.println("En küçük = " +dizi[0]);// baştakini verir

    }
    public static void ortalama(int[] dizi)
    {

        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam=toplam+dizi[i];
        }
        double ort=toplam / dizi.length;
        System.out.println("Ortalama = " +ort);
    }
}
