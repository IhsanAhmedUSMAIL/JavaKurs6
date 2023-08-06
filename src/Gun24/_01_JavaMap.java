package Gun24;

import java.util.HashMap;

public class _01_JavaMap {

    public static void main(String[] args) {

        // set -> HasSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Map -> Anahtar + Set -> Anahtarlı  Set

        // anahtarın tipi Integer, değerin yani value tipi String
        HashMap<Integer, String> hm=new HashMap<>();

        hm.put(1001, "Ihsan Ahmed");
        hm.put(1002, "Yusuf YILMAZ");
        hm.put(2001, "Burahan YILDIZ");
        hm.put(5001, "Elife SÖZEN");
        hm.put(1002, "Seda parça");

        System.out.println("hm = " + hm);

        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(5001) = " + hm.get(5001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(5002) = " + hm.containsKey(5002));

        System.out.println("hm.keySet() = " + hm.keySet()); // keyleri toplu verir
        System.out.println("hm.values() = " + hm.values()); // değerleri toplu verir

        hm.remove(5001);
        System.out.println("hm = " + hm);


    }

}
