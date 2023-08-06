package Gun17.Odev10;

import Gun25._04_Soru.Araba;

import java.util.ArrayList;

public class _02_SoruOdv10 {

    public static void main(String[] args) {

        //ismi getCount() olan bir method oluşturun.
        //
        //Parametre olarak bir String ArayList  ve  bir tane String
        //
        //Return tipi int olmalı.
        //
        //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //
        //Örneğin;
        //
        //ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //
        //String Orange:
        //
        //Count = 2 olmalı. (Orange 2 kez yazılmış)


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Orange");
        arrayList.add("Kiwi");
        arrayList.add("Peach");
        arrayList.add("Banana");
        arrayList.add("Orange");

        String hedef="Orange";
        int say=getCount(arrayList, hedef);
        System.out.println("say = " + say);

    }

    public static int getCount(ArrayList<String> arrayList, String hedef)
    {
        int say=0;

        for (String eleman : arrayList ) {
            if (eleman.equals(hedef)) {
                say++;
            }
        }

        return say;
    }
}
