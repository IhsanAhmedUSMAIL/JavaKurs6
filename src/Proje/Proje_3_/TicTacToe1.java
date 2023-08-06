package Proje.Proje_3_;

import java.util.Scanner;

public class TicTacToe1 {
    public static void main(String[] args) {

        // tablonun index leri
        /* sü   sü   sü
       sa  0,0  0,1  0,2
       sa  1,0  1,1  1,2
       sa  2,0  2,1  2,2
        */

        boolean xOyuncu;
        boolean oOyuncu;
        boolean oyunBitti;
        int[][] satir= new int[3][3];
        int[][] sutun= new int[3][3];

        Scanner oku=new Scanner(System.in);
        System.out.println("1. X oyuncu sırası"+ "\n2. O oyuncu sırası");
        System.out.println();

        System.out.print("Oyuncu sırası seçiniz (1 / 2) = ");
        int sira= oku.nextInt();

        //while (oyunBitti == false) {
            if (sira == 1) {
                System.out.print("Satır seçimi yapınız = ");
                int satirSecim = oku.nextInt();
                System.out.print("Sütün seçimi yapınız = ");
                int sutunSecim = oku.nextInt();

                //xOyuncu[satir][sutun] = true;

            } else if (sira == 2) {
                System.out.print("Satır seçimi yapınız = ");
                int satirSecim = oku.nextInt();
                System.out.print("Sütün seçimi yapınız = ");
                int sutunSecim = oku.nextInt();
            }

        }











    }
//}
