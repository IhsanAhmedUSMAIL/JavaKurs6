package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {

    public static void main(String[] args) {

        HashSet<String> renkler= new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Red");
        renkler.add("Blue");
        renkler.add("Red"); // tekrar değer eklemesi başarısız
        renkler.add("RED");

        System.out.println("renkler = " + renkler);

        //Ekrana tek tek nasıl yazdırırım
        for(String eleman: renkler) { // sıra garanti değil
            System.out.println("eleman = " + eleman);
        }
        //foreach garanti etmiyor

        Integer[] dizi={34,5,6,7,8,89,899,77};
        for(Integer eleman:dizi)
            System.out.println("eleman = " + eleman);

        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(dizi));
        for(Integer e:liste)
            System.out.println("e = " + e);

        // set in kendi sırası nasıl ise onun aynısını verir. Garanti ediyor
        Iterator gosterge= renkler.iterator();
        while (gosterge.hasNext()) // sırada eleman var ise

        {
            System.out.println("gosterge.next() = " + gosterge.next());
            // .Next göstergenin gösterdiği elemanı temsil ediyor
        }

    }

}
