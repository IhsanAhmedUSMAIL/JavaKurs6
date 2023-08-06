package Gun07Odev3;

import java.util.Scanner;

public class _14_SoruOdv3 {

    public static void main(String[] args) {

        // Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınızı giriniz = ");

        String ad=oku.nextLine();

        Scanner read=new Scanner(System.in);
        System.out.print("Soyadınızı giriniz = ");

        String soyad=read.nextLine();

        System.out.println("Adınız ve soyadınız = " + ad.concat(" "+soyad));

    }

}
