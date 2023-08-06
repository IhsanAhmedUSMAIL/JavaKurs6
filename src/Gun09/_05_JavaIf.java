package Gun09;

import java.util.Scanner;

public class _05_JavaIf {

    public static void main(String[] args) {

        // Girilen bir öğrencinin notunua göre 50 den büyük-eşit
        // ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Öğrencinin notunu giriniz = ");
        int not= oku.nextInt();

        System.out.println("not = " + not);

        if (not>=50)
            System.out.println("Geçtiniz = " + not);

        if (not<50)
            System.out.println("Kaldınız = " + not);


    }
}
