package Gun17.Odev10;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_SoruOdv10 {

    public static void main(String[] args) {

        // İsmi changelnArraylist() olan bir method oluşturun.
        //
        //Parametre olarak String ArrayList, String s1, String s2
        //
        //   Arraylist'te s1'i s2 olarak değiştirin
        //
        //Return String arrayList
        // Örneğin;
        //
        //Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        //
        //s1 = blue
        //
        //s2 = yellow
        //
        //Tüm blue 'ları yellow'a dönüştürün.
        //
        //cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("yellow");
        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("red");
        arrayList.add("blue");

        String s1 = "blue";
        String s2 = "yellow";

        ArrayList<String> revListe = changeInArrayList(arrayList, s1, s2);
        System.out.println(revListe);
    }

    public static ArrayList<String> changeInArrayList(ArrayList<String> arrayList, String s1, String s2) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(s1)) {
                arrayList.set(i, s2);
            }
        }

        return arrayList;

    }
}
