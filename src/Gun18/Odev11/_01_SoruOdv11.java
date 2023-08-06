package Gun18.Odev11;

import java.util.HashSet;

public class _01_SoruOdv11 {

    public static void main(String[] args) {

        // Create a method totalCount()
        //
        //totalCount() isminde bir method oluşturun.
        //
        //Parametresi  'Integer Hashset' olmalı
        //
        //HashSetteki eleman sayısını alın.
        //
        //totalCount'u döndürün.
        //
        //_**Örnek:**_
        //
        //hashset ; 4,2,3,1,7
        //
        //cevap: 5


        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(7);

        int say=totalCount(hashSet);
        System.out.println("say = " + say);

    }

    public static int totalCount(HashSet<Integer> hashSet) {
        return hashSet.size();
    }


}
