package Gun09;

import java.util.Scanner;

public class _01_JavaIf {

    public static void main(String[] args) {

        // Baklava Dilimimiz : if
        // Girilen bir sayı 10 dan büyük ise ekrana 10 büyük yazdırınız.

        // 1- Başla   {
        // 2- Sayi oku sayi=oku.next.Int();
        // 3- Sayi > 10 ise "10 dan büyük"
        // 4- Dur }

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi= oku.nextInt();

        if (sayi>10) // normal parantez şart ";" KONULMAYACAKTIR çünkü alttaki ile bağlantısını keser
        { // if in şartı sağlandığında çalışacak bölüm
            System.out.println("10 dan büyük");
            System.out.println("if deyimi kullanıldı"); // kendiliğinden her zaman çalışacak bir satır
        }  // curly braces

        // {} parantezlerini herzaman kullanabilirsiniz
        // ancak if şartı sağlandığında çalışacak tek bir komut varise
        // kullanmak zorunlu değildir
        // if varsa hep bir alttaki satır bağlı oluyor

    }

}
