package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {

    public static void main(String[] args) {

        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1001, "Ihsan Ahmed");
        hm.put(1002, "Yusuf YILMAZ");
        hm.put(2001, "Burahan YILDIZ");
        hm.put(5001, "Elife SÖZEN");
        hm.put(1002, "Seda parça");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer k : hm.keySet())
            System.out.println(k+"\t");

        for (String v : hm.values())
            System.out.println(v+"\t");

        System.out.println();

        System.out.println("hm = " + hm);

        for (Map.Entry<Integer,String> kv: hm.entrySet()) {
            System.out.println(kv.getKey()+" - "+kv.getValue());
        }


    }

}
