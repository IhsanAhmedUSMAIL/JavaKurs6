package Gun18.Odev11;

import java.util.HashSet;

public class _02_SoruOdv11 {

    public static void main(String[] args) {

        // changeSet() isminde bir method oluşturun.
        //
        //Parametre olarak bir String HashSet   ve  iki String
        //
        //return hashset olmalı
        //
        //Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        //
        //**ÖRNEK:**
        //
        //hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        //
        //String 1 = **banana**
        //
        //String 2 = **peach**
        //
        //**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"


        HashSet<String > hashSet=new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Strawbery");
        hashSet.add("Kiwi");
        hashSet.add("Pineapple");

        String s1 = "Banana";
        String s2= "Peach";

        HashSet<String> modifiedSet = changeSet(hashSet, s1, s2);
        System.out.println(modifiedSet);

    }

    public static HashSet<String> changeSet(HashSet<String> hashSet, String s1, String s2) {

        if (hashSet.contains(s1)) {
            hashSet.remove(s1);
            hashSet.add(s2);
        }
        return hashSet;
    }

}
