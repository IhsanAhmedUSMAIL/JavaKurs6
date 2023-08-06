package Gun05Odev2;

import java.util.Scanner;

public class _06_Soru {

    public static void main(String[] args) {

        //Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.

        Scanner dogumGununuz=new Scanner(System.in);
        System.out.print("Doğum günüzüzü giriniz =");

        String dogumGunu=dogumGununuz.nextLine();
        System.out.println("dogumGunu = " + dogumGunu);

    }

}
