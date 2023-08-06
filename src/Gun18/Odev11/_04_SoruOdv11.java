package Gun18.Odev11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _04_SoruOdv11 {

    public static void main(String[] args) {

        // removing() isminde bir method oluşturun.
        //
        //Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
        //
        //Eğer Stringler LinkedHashset 'in içinde varsa, sil.
        //
        //Return tipi linkedhashset
        //
        //Örneğin,
        //
        //linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
        //
        //String 1= Germany
        //
        //String 2 = USA
        //
        // **Germany ve USA 'i sil.**
        //
        //Set'i döndür.

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Germany");
        linkedHashSet.add("France");
        linkedHashSet.add("USA");
        linkedHashSet.add("Canada");
        linkedHashSet.add("Mexico");
        linkedHashSet.add("Brazil");

        String s1 = "Germany";
        String s2 = "USA";

        LinkedHashSet<String> revSet = removing(linkedHashSet, s1, s2);
        System.out.println("revSet = " + revSet);

    }

    public static LinkedHashSet<String> removing(LinkedHashSet<String> linkedHashSet, String s1, String s2) {

        linkedHashSet.remove(s1);
        linkedHashSet.remove(s2);

        return linkedHashSet;

    }

}
