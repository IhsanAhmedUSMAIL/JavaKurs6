package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {

        // ilkel tip, primitive tip : short, byte, long, double, boolean

        int sayi1=5;
        int sayi2=12;

        sayi1=sayi2; // sayi1=12, sayi2 nin değeri alındı ve sayi1 e verildi
        sayi1=34;
        sayi2=45;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // Referans tipleri : class, diziler,Arrayler, nesneler
        // ismi ayrı değeri ayrı tutuluyor
        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); // 1,2,3,4
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); //5,6

        dizi1=dizi2; // referanslar eşitlendi
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); // 5,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); //5,6

        // ikisinin isimleri farklı olsada hafızada aynı değeri gösteriyor

        dizi1[0]=67;
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); //67,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); //67,6

        dizi2[0]=55;
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); //55,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); //55,6

        // Nesne Tipler : Null alabilen, ilkel tip
        // String, Double,Long,Integer
        String ad1="mehmet";
        String ad2="ismet";

        ad1=ad2; // ismet : değeri kopyalandı verildi
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        ad1="ali";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        ad2="zeynep";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        // ilkel tip, referans tip birde bunların arasında olan tip

    }
}
