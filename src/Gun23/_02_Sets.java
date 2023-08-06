package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {

    public static void main(String[] args) {

        // Sets
        // HashSet : Hızlı, bunun için kendine göre algoritmik sırada tutuyor. Diğerlerinden hızlı.
        // LinkedHashSet : EKLENME SIRASINA göre sıralı tutuyor.
        // TreeSet : herzaman içinden sıralı şeklinde soruyor. Kendinden sorumlu.

        //HashSet : Hızlı, bunun için kendine göre algoritmik sırada tutuyor. Diğerlerinden hızlı.
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

        // LinkedHashSet : EKLENME SIRASINA göre sıralı tutuyor.

        LinkedHashSet<String> lns=new LinkedHashSet<>();
        lns.add("bir");
        lns.add("iki");
        lns.add("üç");
        lns.add("dört");
        lns.add("beş");
        System.out.println("lns = " + lns);

        // TreeSet : herzaman içinden sıralı şeklinde soruyor. Kendinden sorumlu. Mesela alfabetik sırasına göre yazar

        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);

    }

}
