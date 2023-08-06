package Gun05Odev2;

import java.util.Scanner;

public class _08_Soru {

    public static void main(String[] args) {

        //Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.

        Scanner agirlik=new Scanner(System.in);

        System.out.print("Ağırlık yazınız =");

        byte agirliginiz=agirlik.nextByte();

        System.out.println("Ağırlığınız  = " + agirliginiz + " " + "Kg");



    }

}
