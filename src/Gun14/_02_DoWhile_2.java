package Gun14;

import java.util.Scanner;

public class _02_DoWhile_2 {

    public static void main(String[] args) {

        // kullanıcıdan x girilene kadar ekrana "program çalışıyor" yazan ve x girildiğinde ise "program bitti" yazınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Harf giriniz = ");
        String harf= oku.next();

        while (!harf.equalsIgnoreCase("x"))

        {
            System.out.println("program çalışıyor");

            System.out.print("harf giriniz = ");
            harf=oku.next();
        }

        System.out.println("program bitti");
    }

}
