package Gun28._01_Ornek;

import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {


        //Scanner oku=new Scanner(System.in);

        Ogrenci ogr1= new Ogrenci();//Bu çalışırken bir metod çalışıyor.
        //1. Yol
        ogr1.id=1;
        ogr1.ad="Ihsan";
        ogr1.soyad="USMAIL";
        ogr1.sinif=6;
        System.out.println("ad = " + ogr1.ad);

        //2.yol
        Ogrenci ogr2=new Ogrenci(3, "Mehmet", "Yılmaz",5);
        System.out.println("ogr2.ad = "+ogr2.ad);

        //3.Yol
        Ogrenci ogr3=new Ogrenci(3, "Ayşe", "Demir");
        System.out.println("ogr3.ad = "+ogr3.ad);
    }

}
