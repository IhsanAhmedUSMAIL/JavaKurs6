package Gun09Odev4;

import java.util.Scanner;

public class _03_SoruOdv4 {

    public static void main(String[] args) {

        // Girilen bir cümle A harfi ile başlıyorsa , EVET, başlamıyorsa HAYIR yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");

        String cumle=oku.nextLine();

        if (cumle.startsWith("A"))
            System.out.println("EVET");

        if (!cumle.startsWith("A"))
            System.out.println("HAYIR");

    }

}
