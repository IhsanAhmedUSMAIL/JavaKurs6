package Gun06;

import java.util.Scanner;

public class _04_StringCharAt {

    public static void main(String[] args) {

        // istenilen noktadaki karakteri verir

        String cumle="Merhab Dünya"; // uzunluğu 13, bilgisayar 0 dan başladığı için oda numarası 0-12 adı da index
        System.out.println("uzunluk=" +" " +cumle.length());

        char ilkHarf=cumle.charAt(0); //0 Daki karakteri ver yani ilk harfı verecek.
        System.out.println("ilkHarf = " + ilkHarf);

    }

}
