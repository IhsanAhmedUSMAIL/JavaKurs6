package Gun05Odev2;

import java.util.Scanner;

public class _05_Soru {

    public static void main(String[] args) {

        //Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.

        Scanner eskisehrin=new Scanner(System.in);
        System.out.print("10 Sene önce yaşadığınız şehrin adı = ");

        String sehir= eskisehrin.nextLine();
        System.out.println("sehir = " + sehir);

    }

}
