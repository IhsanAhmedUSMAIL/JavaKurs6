package Gun25.Odev12;

import java.util.Scanner;

public class NotDefteri {

    public static void main(String[] args) {

        Ogrenci[] ogrenciler= new Ogrenci[20];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) +". Öğrenci bilgilerini girin");
            System.out.print("Okul No: ");
            int okulNo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Tam adı: ");
            String tamAdi=scanner.nextLine();

            System.out.print("Notu: ");
            int notu = scanner.nextInt();
            scanner.nextLine();

            Ogrenci ogrenci = new Ogrenci(okulNo, tamAdi, notu);
            ogrenciler[i] = ogrenci;

        }

        System.out.println("Öğrencilerin bilgileri: ");
        yazdirOgrenciler(ogrenciler);

        double notOrtalamasi = hesaplaNotOrtalamasi(ogrenciler);
        System.out.println("Sınıf not ortalamasi = " + notOrtalamasi);

    }

    public static void yazdirOgrenciler(Ogrenci[] ogrenciler) {

        for (Ogrenci ogrenci : ogrenciler) {

            System.out.println("Okul No: " + ogrenci.getOkulNo());
            System.out.println("Tam adı: " +ogrenci.getTamAdi());
            System.out.println("Notu: " +ogrenci.getNotu());
            System.out.println();

        }
    }

    public static double hesaplaNotOrtalamasi(Ogrenci[] ogrenciler) {
        int toplamNot = 0;

        for (Ogrenci ogrenci : ogrenciler) {
            toplamNot += ogrenci.getNotu();
        }
        return (double) toplamNot/ogrenciler.length;
    }

}
