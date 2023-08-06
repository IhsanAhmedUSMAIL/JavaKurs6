package Gun10;

import java.util.Scanner;

public class _01_IfElse {

    public static void main(String[] args) {

        /// Girilen bir öğrencinin notunua göre 50 den büyük-eşit
        //  ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Öğrencinin notunu giriniz = ");
        int not= oku.nextInt();

        // 1. Yöntem  bilgisayar boş yere çalışıyor

        if (not>=50)
            System.out.println("Geçtiniz = " + not);

        if (not<50)
            System.out.println("Kaldınız = " + not);

        // 2.yöntem olması gereken : birinciyi çalıştırdığında ikincisini kontrol etmiyor bu şekilde bilgisayar yorulmaz

        if (not >= 50)
            System.out.println("Geçtiniz");
        else
            System.out.println("Kaldınız"); // else her zaman kendinin üstündeki if e bağlıdır.

    }

}
