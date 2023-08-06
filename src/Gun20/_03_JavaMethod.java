package Gun20;

import Tools.MyFunc;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {

        // kullanıcının gireceği iki sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oky=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz = ");
        int sayi1= oky.nextInt();

        System.out.print("İkinci sayıyı giriniz = ");
        int sayi2= oky.nextInt();

        int enb=enbBul(sayi1,sayi2);
        System.out.println("enb = " + enb);
        int rndSayi= MyFunc.rndTamSayi(10);

    }

    public static int enbBul(int s1, int s2){ // metodun imzası
        //if (s1>s2)
        // System.out.println("En büyük sayı = " + s1);
        //else
         //   System.out.println("En büyük sayı = " + s2);
        return (s1>s2 ? s1 : s2); // Sayi1 sayi2 den büyük ise s1 yaz değil ise (:) s2 yaz
    }

}
