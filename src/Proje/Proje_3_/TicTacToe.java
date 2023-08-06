package Proje.Proje_3_;

import java.util.Scanner;

public class TicTacToe {

   /*

   0,0  0,1  0,2
   1,0  1,1  1,2
   2,0  2,1  2,2

    */

    public static void main(String[] args) {

        boolean[][] xOyuncu = new boolean[3][3]; // x oyuncunun nerde olduğunu takip etmek için.
        boolean[][] oOyuncu = new boolean[3][3]; // 0 oyuncunun nerde olduğunu takip etmek için.

        int oyuncuSirasi = 1; // youn başladığında birinci sıradaki oyuncu ile başlasın
        int satir = 0;
        int sutun = 0;

        boolean oyunBitti = false; // oyun bitene kadar döngüyü sağlamak için
        Scanner oku = new Scanner(System.in);

        // oyun tablosunu çizmek için
        for (int i = 0; i < 3; i++) { // satırı temsil eder
            System.out.println(); // imleci bir sonraki satıra taşıması için
            for (int j = 0; j < 3; j++) { // sütünü temsil eder
                System.out.print(" _| "); // yan yana olmaları için ln sildik
            }

        }

        while (oyunBitti == false) {
            System.out.println(); // imleci tablonun dışına çıkarıp oyuncuyu soru sorabilmek için

            System.out.print("Satır index seçimi yapınız = ");
            satir = oku.nextInt();
            System.out.print("Sütun index seçimi yapınız =");
            sutun = oku.nextInt();

            if (oyuncuSirasi == 1) {
                xOyuncu[satir][sutun] = true; // x oyuncuyu güncellemiş oluruz
            } else {
                oOyuncu[satir][sutun] = true;
            }

            tabloyuGuncelle(xOyuncu, oOyuncu);

            // kazananı mainin dışında oluşturdğümüz boolean metodundan çağırdık

            oyunBitti = kazanan(xOyuncu, oOyuncu); // oyun bitti ise oyuncu sırası değiştirmeyi engellememiz gerekiyor
            if(oyunBitti == true) {
                break;
            }

            // oyuncu sırasını değiştirme
            if(oyuncuSirasi ==1 ){
                oyuncuSirasi =2;
            }
            else {
                oyuncuSirasi = 1;
            }

        }

        System.out.println();
        if (oyuncuSirasi == 1) {
            System.out.println("Tebrikler X oyuncu kazandı !!!");
        }
        else {
            System.out.println("Tebrikler O oyuncu kazandı !!!");
        }
    }

    public static void tabloyuGuncelle(boolean[][] p1Oyuncu, boolean[][] p2Oyuncu) {
        System.out.println("\u000c"); // oyun konsolunu temizlemek için (return almamıza gerek yok o yüzden void(tipsiz))

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if(p1Oyuncu[i][j] == true){
                    System.out.print(" X ");
                } else if(p2Oyuncu[i][j] == true) {
                    System.out.print(" O ");
                }
                else {
                    System.out.print(" _ "); // 3 olasılığımız var çünkü
                }

            }
        }

    }
    // kazananı belirle

    public static boolean kazanan (boolean[][] p1Oyuncu, boolean[][] p2oyuncu) {
        // yatay olarak en üst satırı kontrol et (index 0)
        if(p1Oyuncu[0][0] == true && p1Oyuncu[0][1] == true && p1Oyuncu[0][2] == true){
            return  true;
        }
        else if(p2oyuncu[0][0] == true && p2oyuncu[0][1] == true && p2oyuncu[0][2] == true) {
            return true;
        }

        //yatay olarak orta satırı kontrol et (index 1)
        else if(p1Oyuncu[1][0] == true && p1Oyuncu[1][1] == true && p1Oyuncu[1][2] == true){
            return  true;
        }
        else if(p2oyuncu[1][0] == true && p2oyuncu[1][1] == true && p2oyuncu[1][2] == true) {
            return true;
        }

        //yatay olarak enalt satırı kontrol et (index 2)
        else if(p1Oyuncu[2][0] == true && p1Oyuncu[2][1] == true && p1Oyuncu[2][2] == true){
            return  true;
        }
        else if(p2oyuncu[2][0] == true && p2oyuncu[2][1] == true && p2oyuncu[2][2] == true) {
            return true;
        }

        // dikey olarak ilk (sol) sütunu kontrol et (index 0)

        else if(p1Oyuncu[0][0] == true && p1Oyuncu[1][0] == true && p1Oyuncu[2][0] == true){
            return  true;
        }
        else if(p2oyuncu[0][0] == true && p2oyuncu[1][0] == true && p2oyuncu[2][0] == true) {
            return true;
        }

        // dikey olarak orta sütunu kontrol et (index 1)

        else if(p1Oyuncu[0][1] == true && p1Oyuncu[1][1] == true && p1Oyuncu[2][1] == true){
            return  true;
        }
        else if(p2oyuncu[0][1] == true && p2oyuncu[1][1] == true && p2oyuncu[2][1] == true) {
            return true;
        }

        // dikey olarak son(sağ) sütunu kontrol et (index 1)

        else if(p1Oyuncu[0][2] == true && p1Oyuncu[1][2] == true && p1Oyuncu[2][2] == true){
            return  true;
        }
        else if(p2oyuncu[0][2] == true && p2oyuncu[1][2] == true && p2oyuncu[2][2] == true) {
            return true;
        }

        // sola çaprazı kontrol et

        else if(p1Oyuncu[2][0] == true && p1Oyuncu[1][1] == true && p1Oyuncu[0][2] == true){
            return  true;
        }
        else if(p2oyuncu[2][0] == true && p2oyuncu[1][1] == true && p2oyuncu[0][2] == true) {
            return true;
        }

        // sağa çaprazı kontrol et

        else if(p1Oyuncu[0][0] == true && p1Oyuncu[1][1] == true && p1Oyuncu[2][2] == true){
            return  true;
        }
        else if(p2oyuncu[0][0] == true && p2oyuncu[1][1] == true && p2oyuncu[2][2] == true) {
            return true;
        }
        return true;

    }

}




