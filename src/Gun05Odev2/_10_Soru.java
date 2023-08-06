package Gun05Odev2;

import java.util.Scanner;

public class _10_Soru {

    public static void main(String[] args) {

        //Kullanıcıdan alacağının 2 sayının 4 işlemini ekrana yazdırınız.

        Scanner sayi1=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz = ");
        double rakam1= sayi1.nextDouble();

        Scanner sayi2=new Scanner(System.in);
        System.out.print("İkinic sayıyı giriniz = ");
        double rakam2=sayi2.nextDouble();


        double toplam=rakam1+rakam2;
        System.out.println("toplam = " + toplam);

        double fark=rakam2-rakam1;
        System.out.println("fark = " + fark);

        double bolme=rakam2/rakam1;
        System.out.println("Bölme = " + bolme);


        double carpma=rakam1*rakam2;
        System.out.println("Çarpma = " + carpma);



    }

}
