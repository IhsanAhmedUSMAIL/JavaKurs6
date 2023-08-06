package Gun14;

import java.util.Scanner;

public class _01_DoWhile_1 {

    public static void main(String[] args) {

        //kullanıcı 0 değer girene kadar, girilen sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        int toplam=0;

        System.out.print("Sayi giriniz = ");
        int sayi= oku.nextInt();
        toplam=toplam+sayi;

        while(sayi !=0)
        {
            System.out.print("Sayi giriniz = ");

            sayi= oku.nextInt();
            toplam=toplam+sayi;

        }
        System.out.println("toplam = " + toplam);

    }

}
