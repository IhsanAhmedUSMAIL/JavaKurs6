package Gun10;

import java.util.Scanner;

public class _06_IfElse {

    public static void main(String[] args) {

        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz
        // kurallar:
        // 1) en azz 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı (büyük/küçük)
        // 3) en fazla 12 karakter olmalı
        // kurallara uygun veya değil yazınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Password giriniz = ");

        String sifre=oku.nextLine();

        if (sifre.length()>=8 && !sifre.toLowerCase().contains("pass") && sifre.length()<=12)
            System.out.println("Kurallara uygun"); // ! yerine == false kullanabilirdik
        else
            System.out.println("Kurallara uygun değil");

    }

}
