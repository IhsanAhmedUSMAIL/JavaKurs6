package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {

    public static void main(String[] args) {

        int sayi=5; // hafızada sadece bir sayı saklıyor
        int[] dizi=new int[6]; // Hafızada 6 sayı saklıyor; sabit boyutlu
        ArrayList<Integer> liste=new ArrayList<>(); // boyu değişken, sınır yok.
        // bunlarda tekrar eden olmaması lazım.

        // Java cım, şuana kadar verdiğin değişkenler için teşekkür ederim, bir çok işimi gördü
        // bana öyle bir dizi tipi verki, içinde tekrar eden DEĞERLER olmasın, ve bazen istersem her zaman sıralı olsun,
        // bazen istersem eklendiği sırada sıralı olsun, bazen de sen olabildiğince hızlı çalış sıra önemli olmasın.
        //java mektubumuza cevap verdi;
        // Sevgili Ihsan sen hiç canını sıkma, bu iş için tasarlanmış SET ler adını verdiğimiz özel diziler var.
        // HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sırada tutuyor
        // LinkedHashSet -> Sen ekledikçe, ekleme sırasına göre tutuyor.
        // TreeSet -> sen ekledikçe onları herzaman sıralı tutuyor.
        // Bunların ortak özelliği TEKRAR eden DEĞER YOK ve INDEX yok.


        HashSet<Integer> hs1=new HashSet<>(); // amacı hızlı çalışmak ve tekrar etmemek
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendiMi=hs1.add(5);  // tekrar eklendi. acaba diziye kabul etti mi?
        hs1.add(2); // tekrar eklendi. acaba diziye kabul etti mi?

        System.out.println("hs1 = " + hs1);
        System.out.println("eklendiMi = " + eklendiMi);


    }

}
