package Gun05Odev2;

import java.util.Scanner;

public class _03_Soru {

    public static void main(String[] args) {

        // Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.

        Scanner meyve=new Scanner(System.in);
        System.out.print("En sevdiğiniz meyvenin adı =");

        String meyveAdı= meyve.nextLine();
        System.out.println("meyveAdı = " + meyveAdı);

    }

}
