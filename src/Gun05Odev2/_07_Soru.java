package Gun05Odev2;

import java.util.Scanner;

public class _07_Soru {

    public static void main(String[] args) {

        //Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //   Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.

        Scanner bankaHesap=new Scanner(System.in);
        System.out.print("Bir Banka Hesabınız Var mı? = true/false");

        boolean sonuc=bankaHesap.nextBoolean();
        System.out.println("sonuc = " + sonuc);






    }

}
