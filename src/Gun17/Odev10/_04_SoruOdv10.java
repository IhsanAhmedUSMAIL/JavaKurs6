package Gun17.Odev10;

import java.util.ArrayList;

public class _04_SoruOdv10 {

    public static void main(String[] args) {

        //getLength() isminde bir method oluşturun.
        //
        //Parametre olarak String ArrayList
        //
        //Return tipi Integer ArrayList
        //
        //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
        //
        //Tüm elementlerin uzunluğunu döndürün
        //
        //Örneğin;
        //
        //ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        //
        //Tüm Stringlerin uzunluklarını yazdırın;
        //
        //cevap: 10 ,  8 , 4 , 7 , 6 olmalı

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("New jersy");
        arrayList.add("New york");
        arrayList.add("Ohio");
        arrayList.add("Florida");
        arrayList.add("Boston");

        ArrayList<Integer> uzunluk = getLength(arrayList);
        System.out.println("uzunluk = " + uzunluk);

    }

    public static ArrayList<Integer> getLength(ArrayList<String> arrayList) {
        ArrayList<Integer> uzunluk = new ArrayList<>();

        for (String str : arrayList) {
            int length = str.length();
            uzunluk.add(length);
        }

        return uzunluk;
    }

}
