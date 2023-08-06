package Gun24;

import java.util.*;


public class _03_HashMap {

    public static void main(String[] args) {



        Map<Integer, String> hm=new HashMap<>(); // Map lerde HashMap
        hm.put(9, "tilki");
        hm.put(2, "tavşan");
        hm.put(30, "kedi");
        hm.put(11, "köpek");
        hm.put(4, "timsah");
        System.out.println("hm = " + hm); // hızlı çalışmak için kendine göre sıralı


        Map<Integer, String> lhm=new LinkedHashMap<>(); //Map lerden LinkedHashMap
        lhm.put(9, "tilki");
        lhm.put(2, "tavşan");
        lhm.put(30, "kedi");
        lhm.put(11, "köpek");
        lhm.put(4, "timsah");
        System.out.println("lhm = " + lhm); // ekleme sırasına göre sıralı


        Map<Integer, String> tm=new TreeMap<>();//Map lerden TreeMap
        tm.put(9, "tilki");
        tm.put(2, "tavşan");
        tm.put(30, "kedi");
        tm.put(11, "köpek");
        tm.put(4, "timsah");
        System.out.println("tm = " + tm); // herzaman sıralı, kendinden sorumlu

    }

}
