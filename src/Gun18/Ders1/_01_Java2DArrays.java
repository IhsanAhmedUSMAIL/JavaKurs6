package Gun18.Ders1;

import java.util.Scanner;

public class _01_Java2DArrays {
    // aldığımız birden fazla verileri saklayıp daha sonra saklayabilmek için

    public static void main(String[] args) {
        int sayi=0; //1 sayı sakladı
        int[] dizi=new int[100]; // 100 tane sayı saklıyor

        int[] ders1Not=new int[50]; // 50 kişilik ders 1 notları
        int[] ders2Not=new int[50]; // 50 kişilik ders 2 notları
        int[] ders3Not=new int[50]; // 50 kişilik ders 3 notları

        int[][] tunDersNotlari=new int[3][50]; // yukardaki 3 satır komut yerine bu şekilde
        // 2D ile 3 tane 50 kişilik sayı tutabiliriz

        ders1Not[0]=80; // tek boyuboyutlu dizinin ilk elemanı

        tunDersNotlari[0][0]=80; // 2 indexle gösterilir, taablonun ilk elemanı

        System.out.println("tunDersNotlari[0][0] = " + tunDersNotlari[0][0]);

        Scanner oku=new Scanner(System.in);
        tunDersNotlari[0][0]= oku.nextInt();
    }

}
