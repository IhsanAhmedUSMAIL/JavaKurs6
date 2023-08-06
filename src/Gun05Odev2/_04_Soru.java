package Gun05Odev2;

import java.util.Scanner;

public class _04_Soru {

    public static void main(String[] args) {

        //Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın

        Scanner arabaKapisi=new Scanner(System.in);

        System.out.print("Arabanızdaki kapı sayısını giriniz = ");

        int arabakapisayisi= arabaKapisi.nextInt();
        System.out.println("arabakapisayisi = " + arabakapisayisi);



    }
}
