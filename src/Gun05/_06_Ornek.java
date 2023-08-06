package Gun05;

import java.util.Scanner;

public class _06_Ornek {

    public static void main(String[] args) {

        // Bir karenin kenarını kullanıcıdan isteyip
        // çevresini ve alanını bulunuz ve yazdırınız
        // cevre=a+a+a+a alan =a*a

        Scanner oku = new Scanner(System.in);

        System.out.print("Karenin kenar uzunluğu =");
        int Kenar=oku.nextInt();

        int cevre=Kenar+Kenar+Kenar+Kenar; // 4*Kenar da yapabilirsin
        System.out.println("cevre = " + cevre);

        int alan=Kenar*Kenar;
        System.out.println("alan = " + alan);

        // vaya

        System.out.println("cevre = " + (4*Kenar));
        System.out.println("alan = " + (Kenar*Kenar));

    }
}
