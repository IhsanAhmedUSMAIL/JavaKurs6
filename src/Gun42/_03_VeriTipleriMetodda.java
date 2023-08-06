package Gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {
        //ilkel tip
        int sayi=5;
        sayiArtir(sayi); // SADECE DEĞERİ gitti, kendisi değil
        System.out.println("sayi = " + sayi);

        sayi=sayiArtir2(sayi);
        System.out.println("sayi = " + sayi);

        // Referans Tiplerde(new)
        int[] dizi={1,2,3,4}; // int[] dizi= new iint[]{1,2,3,4};
        diziSifirla(dizi); // giden referans ise 0000, değilse 1234 yazar
        System.out.println("dizi = " + Arrays.toString(dizi));

        //Nesne Tipler
        String kelime="ismet";
        kelimesifirla(kelime);
        System.out.println("kelime = " + kelime); // ismet

        // özet: temel fark
        //1-ilkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider. Eşitlendiğinde sadece değer aktarılır.
        //2-Nesne tipleri ilkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar.
        //3-Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.

    }

    public static void kelimesifirla(String kelime) {
        kelime="";
    }

    public static void diziSifirla (int[] dizi) { // gelen kendisi ise(referans) 0000, değilse 1234 yazar
        // gelen kendizi ise return yapmaya gerek yok
        dizi[0]=0;
        dizi[1]=0;
        dizi[2]=0;
        dizi[3]=0;

    }

    public static void sayiArtir(int sayi) { // ilkel tiplerde ismi aynı olsa bile sadece değer gelir
        sayi++;
    }

    public static int sayiArtir2(int sayi) { // ilkel tiplerde ismi aynı olsa bile sadece değer gelir
        sayi++;
        return sayi;
    }
}
