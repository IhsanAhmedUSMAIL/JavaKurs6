package Gun09;

import java.util.Scanner;

public class _04_JavaIf {

    public static void main(String[] args) {

        // girilen bir sayının tek mi çift mi olduğunu yazdırınız
        // tek veya çift şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");

        int sayi= oku.nextInt();

        if (sayi%2 == 0) // sayi 2 ye bölündüğü zaman kalan var ise tek yok ise çift
        System.out.println("Çift = " + sayi); // (sayi%2 != 0) bu durum da hem pozitif hem de negatif devreye girer

        if (sayi%2 == 1)
        System.out.println("Tek = " + sayi);

    }

}
