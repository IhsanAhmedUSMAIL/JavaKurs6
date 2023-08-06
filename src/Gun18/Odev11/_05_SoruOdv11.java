package Gun18.Odev11;

import java.util.ArrayList;

public class _05_SoruOdv11 {

    public static void main(String[] args) {


        // 5- 2D ArrayList
        //
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


        int [][] dizi = {

                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        ArrayList<Integer> arrayList = listeyeElemanlariSakla(dizi);
        System.out.println("arrayList = " + arrayList);

        }

        public static ArrayList<Integer> listeyeElemanlariSakla(int[][] dizi) {
        ArrayList<Integer> arrayList= new ArrayList<>();

        for (int[] dizec : dizi) {
            for (int elman : dizec){
                arrayList.add(elman);}
        }
            return arrayList;
        }

    }


