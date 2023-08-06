package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {

    public static void main(String[] args) {

        // girilen 5 tam sayının toplamın sonucunu yazdırınız

        Scanner oku=new Scanner(System.in);

        int sayac=1;
        int toplam=0;

        while (sayac<=5)
        {

            System.out.print(sayac+" "+ "Sayı giriniz = ");
            int sayi= oku.nextInt();
            toplam=toplam+sayi;

            sayac++;

        }

        System.out.println("toplam = " +toplam);
    }

}
