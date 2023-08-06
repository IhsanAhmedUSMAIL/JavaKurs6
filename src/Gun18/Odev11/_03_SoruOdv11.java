package Gun18.Odev11;

import java.util.ArrayList;
import java.util.HashSet;

public class _03_SoruOdv11 {

    public static void main(String[] args) {

        // commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
        //
        //return tipi arraylist olmalı.
        //
        //**ÖRNEĞİN:**
        //
        //    İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
        //
        //     İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
        //
        //Ortak değerleri ArrayListe ekleyiniz.
        //
        //çıktı:  "Germany" , "Brazil" ,"USA"
        //
        //ArrayListi yazdırınız.

        HashSet<String> set1= new HashSet<>();
        set1.add("Germany");
        set1.add("England");
        set1.add("S.Africa");
        set1.add("Brazil");
        set1.add("USA");

        HashSet<String> set2= new HashSet<>();
        set2.add("Germany");
        set2.add("China");
        set2.add("Brazil");
        set2.add("France");
        set2.add("USA");

        ArrayList<String> commonValuesList = commonValues(set1, set2);
        System.out.println("commonValuesList = " + commonValuesList);

    }

    public static ArrayList<String> commonValues(HashSet<String> set1, HashSet<String> set2) {

        ArrayList<String> commonValueList=new ArrayList<>();

        for (String value : set1) {
            if (set2.contains(value)) {
                commonValueList.add(value);
            }

        }
        return commonValueList;
    }


}


