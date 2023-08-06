package Gun43;

import java.util.Scanner;

public class _08_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.println("Yeni şifre");
        String newPassword= oku.nextLine();

        if (newPassword.length() <8) {
            System.out.println("Lütfen dikkat!");
            System.out.println("Şifre en az 8 karakter olmalı");
            // hangi ip bağlandı kaydedersin
            // yapılacak ortak işler
        }

        if (newPassword.length() > 15) {
            System.out.println("Lütfen dikkat!");
            System.out.println("Şifre en fazla 15 karakter olmalı");
            // hangi ip bağlandı kaydedersin
            // yapılacak ortak işler
        }

    }
}
