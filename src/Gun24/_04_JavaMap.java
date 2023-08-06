package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _04_JavaMap {

    public static void main(String[] args) {

        // Bir kartvizit uygulamasını 2 kişi için yapınız

        Map<String,String> ugurKartVizit=new HashMap<>();
        ugurKartVizit.put("isim","Uğur");
        ugurKartVizit.put("email","ugur@gmail.com");
        ugurKartVizit.put("adres","kocaeli");
        ugurKartVizit.put("telefon","05554692523");

        System.out.println("ugurKartVizit.get(isim) = " + ugurKartVizit.get("isim"));
        System.out.println("ugurKartVizit.get(email) = " + ugurKartVizit.get("email"));

        Map<String, String> IhsanKartVisit=new HashMap<>();
        IhsanKartVisit.put("isim", "Ihsan");
        IhsanKartVisit.put("email", "i.usmail@sermakmetal.com.tr");
        IhsanKartVisit.put("adres", "başiskele");
        IhsanKartVisit.put("telefon", "05434636875");

        Map<String, Map<String, String> > kartvizitler=new HashMap<>();

        kartvizitler.put("ugur", ugurKartVizit);
        kartvizitler.put("Ihsan", IhsanKartVisit);

        // uğur adresi
        System.out.println(kartvizitler.get("ugur").get("adres"));

        // Ihsan email
        System.out.println(kartvizitler.get("Ihsan").get("email"));

        for(Map.Entry<String, Map<String, String>> kv: kartvizitler.entrySet())
        {
            System.out.println("kv = " + kv);
            System.out.println(kv.getValue());
            System.out.println(kv.getValue().get("email"));// entrySet() keys+values demektir.
            System.out.println(kv.getValue().get("adres"));
        }


    }

}
