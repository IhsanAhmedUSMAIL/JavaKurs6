package Tekrar;

import java.util.Scanner;

public class _05_forWhileDoWhile {

    public static void main(String[] args) {

        // for, while, doWhile
        // kaç kere döneceği belli ise, sınırları belli : for
        //değilse while döngüsüdür, kontrol sonda ise doWhile


        Scanner oku=new Scanner(System.in);
         int toplam=0;
        for (int sayac=1; sayac<=5; sayac++) {

            System.out.println("Sayi giriniz=");
            int sayi = oku.nextInt();

            toplam=toplam+sayac;

        }
        System.out.println("toplam = " + toplam);


        //**************
        // kullanıcı sıfır değeri girene kadar girilen sayıları toplayınız

        int sayi=1;
        while (sayi!=0) { // döngünün devam şartı yazılıyor

            System.out.println("Sayi giriniz while=");
            sayi = oku.nextInt();

            toplam=toplam+sayi;
        }
        System.out.println("toplam = " + toplam);

        /*******************************/

        toplam=0;

        do{
                System.out.println("Sayi giriniz while=");
                sayi = oku.nextInt();

                toplam=toplam+sayi;
            } while (sayi!=0);

            System.out.println("toplam = " + toplam);
        }

    }


