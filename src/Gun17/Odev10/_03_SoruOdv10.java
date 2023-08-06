package Gun17.Odev10;

import java.util.ArrayList;

public class _03_SoruOdv10 {

    public static void main(String[] args) {


        //getSum() isminde bir method oluşturun.
        //
        //Parametresi ArrayList olmalı
        //
        //Return tipi int olmalı.
        //
        //ArrayList teki tüm sayıları birbiri ile toplayın.
        //
        //return olarak toplam sonucu döndürün.
        //
        //Örneğin;
        //
        //Arraylist = 1,2,3,4,5
        //
        //return 15 olmalı

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int toplam=getSum(arrayList);
        System.out.println("toplam = " + toplam);

    }
    public static int getSum (ArrayList<Integer> arrayList) {
        int toplam=0;

        for (int sayi : arrayList) {
            toplam += sayi;
        }

        return toplam;
    }

}
