package Gun07Odev3;

import java.util.Scanner;

public class _15_SoruOdv3 {

    public static void main(String[] args) {

        // Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Kelime giriniz = ");

        String kelime=oku.nextLine();

        System.out.println("kelime boş mu = " + kelime.isEmpty());

    }
}
