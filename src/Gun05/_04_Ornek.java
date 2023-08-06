package Gun05;

import java.util.Scanner;

public class _04_Ornek {

    public static void main(String[] args) {

        // kullanıcıdan Adını ve Soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırınız.


        Scanner oku = new Scanner(System.in);

        System.out.print("Adınızı giriniz = ");
        String ad = oku.nextLine();


        System.out.print("Soyadınızı giriniz = ");
        String soyad = oku.nextLine();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("Adınız ve soyadınız = "+ ad+" "+soyad);





    }
}
