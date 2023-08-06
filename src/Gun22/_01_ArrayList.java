package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        // Array -> Arrays metodları
        // ArrayList - > Collection Metodları

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        // sıralama işlemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Tersine çevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Bütün elemanları tek bir değere set etme
        Collections.fill(sayilar, 0); // hepsine sıfır yazar
        System.out.println("sayilar = " + sayilar);

        // replace
        Collections.replaceAll(sayilar,0,5); // sıfır sayıları 5 ile değiştir
        System.out.println("sayilar = " + sayilar);

        // tanımlarken değer atama
        int[] dizi= {2,3,45,56};
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,4,56,78,89));
        ArrayList<String> strListe= new ArrayList<>(Arrays.asList("Ahmet", "Ayşe", "Kaya"));

        System.out.println("liste = " + liste);
        System.out.println("strListe = " + strListe);

        // AddAll : bir veya fazla değerleri liste ekler
        Collections.addAll(sayilar, 56,77,88,99,77);
        System.out.println("sayilar = " + sayilar);

        // bir diziyi nasıl Arrayliste atarım

        Integer[] dizi2= {2,3,45,56};
        ArrayList<Integer> liste3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3 = " + liste3);

        // int dediğimizde sadece bir sayı saklar Integer dediğimiz zaman hem sayı saklar hem de bir sürü metod saklar

    }
}
