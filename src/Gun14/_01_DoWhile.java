package Gun14;

import java.util.Scanner;

public class _01_DoWhile {

    public static void main(String[] args) {

        // kullanıcı 0 değer girene kadar, girilen sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayi=0;


        do{ // bu döngü en az bir kere çalışır
            System.out.print("Sayı giriniz = ");
            sayi= oku.nextInt();

            toplam=toplam+sayi;
        }while (sayi!=0); // döngünün dönme şartı girilen sayının 0 dan farklı olması (şart kontrolu sonda)

        System.out.println("toplam = " + toplam);

    }

}
