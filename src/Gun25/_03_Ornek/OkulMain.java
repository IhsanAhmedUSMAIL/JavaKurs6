package Gun25._03_Ornek;

import jdk.nashorn.internal.codegen.ObjectClassGenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {

    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Ogrenci> ogrenciler=new ArrayList<>(); // bu şekilde tek tek öğrenci girmene gerek yok

        for (int i = 0; i < 3; i++) {
            Ogrenci ogr=new Ogrenci();

            System.out.print("Öğrenci Adı =");
            ogr.adi=okuStr.nextLine();
            System.out.print("Öğrenci soyadı =");
            ogr.soyadi=okuStr.nextLine();
            System.out.print("Öğrenci sınıfı =");
            ogr.sinifi= okuInt.nextInt();
            System.out.print("Öğrenci adresi =");
            ogr.adres=okuStr.nextLine();

            ogrenciler.add(ogr);

        }

        for (Ogrenci o : ogrenciler) {
            System.out.println("o.adi = " + o.adi);
            System.out.println("o.soyadi = " + o.soyadi);
            System.out.println("o.sinifi = " + o.sinifi);
            System.out.println("o.adres = " + o.adres);
        }

    }

}
