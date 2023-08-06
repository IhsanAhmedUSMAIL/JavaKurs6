package Gun12;

import java.util.Scanner;

public class _05_IfElseIf {

    public static void main(String[] args) {

        // Soru: Kullanıcıdan Fizik:90 şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Fizik:90 şeklinde ders notu giriniz = ");

        String notStr=oku.nextLine();

        int ind=notStr.indexOf(":");

        int ogrNot=Integer.parseInt(notStr.substring(ind+1));

        System.out.println("ogrNot 1 = " + ogrNot);

        // 2.Yöntem 0-9 un dışındakileri(^) sil

        ogrNot =Integer.parseInt(notStr.replaceAll("[^0,9]", ""));
        System.out.println("ogrNot 2 = " + ogrNot);

        if (ogrNot>= 90)
            System.out.println("A");
        else if (ogrNot>= 80)
            System.out.println("B");
        else if (ogrNot>= 70)
            System.out.println("C");
        else if (ogrNot>= 60)
            System.out.println("D");
        else if (ogrNot>= 40)
            System.out.println("E");
        else
            System.out.println("F");





    }

}
