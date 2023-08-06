package Gun17.Odev10;

import java.util.ArrayList;

public class _01_SoruOdv10 {

    public static void main(String[] args) {


        //Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //
        //Store all the elements in one arraylist and print the arraylist
        //
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //
        //**Örnek:**
        //
        //```
        //**Girdi:**
        //[
        // [ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]
        //]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]
        //```

        int [][] dizi = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int[] dizec:dizi){
            for (int eleman : dizec) {
                arrayList.add(eleman);
            }
        }
        System.out.println("arrayList = " + arrayList);
    }

}
