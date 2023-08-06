package Gun14;

import java.util.Scanner;

public class _02_DoWhile {

    public static void main(String[] args) {

        // kullanıcıdan x girilene kadar ekrana "program çalışıyor" yazan ve x girildiğinde ise "program bitti" yazınız

        Scanner oku=new Scanner(System.in);

        String harf;

        do {
            System.out.print("harf giriniz = ");
            harf= oku.next();

            if (!harf.equalsIgnoreCase("x"))
            System.out.println("program çalışıyor");

        } while (!harf.equalsIgnoreCase("x"));

        System.out.println("program bitti");

        }

    }


