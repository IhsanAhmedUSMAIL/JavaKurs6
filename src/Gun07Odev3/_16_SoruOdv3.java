package Gun07Odev3;

import java.util.Scanner;

public class _16_SoruOdv3 {

    public static void main(String[] args) {

        // Girilen bir kelimenin ilk ve son harfini bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir kelime giriniz = ");

        String kelime=oku.nextLine();

        char ilkHarf=kelime.charAt(0);
        System.out.println("ilk Harf = " + ilkHarf);

        int uzunluk=kelime.length();
        System.out.println("Son harf = " + kelime.charAt(uzunluk-1));


    }

}
