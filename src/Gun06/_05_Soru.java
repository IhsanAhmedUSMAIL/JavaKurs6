package Gun06;

import java.util.Scanner;

public class _05_Soru {

    public static void main(String[] args) {

        //Girilen bir stringin sadece son harfını yazdırınız

        Scanner kelime=new Scanner(System.in);
        System.out.print("Cümle giriniz = ");

        String cumle=kelime.nextLine();

        int uzunluk=cumle.length();

        System.out.println("cumle = " + cumle);

        char sonuncuHarf=cumle.charAt(uzunluk-1);
        System.out.println("Sonuncu Harf = " + sonuncuHarf);

        //2.Yöntem

        System.out.println(" Sonuncu Harf = " + cumle.charAt(cumle.length()-1));



    }

}
