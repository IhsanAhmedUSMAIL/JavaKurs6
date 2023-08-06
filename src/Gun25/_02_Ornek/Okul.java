package Gun25._02_Ornek;

// main için kullanılan dosya
public class Okul {

    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci();

        ogr1.okulNo=1002;
        ogr1.adi="Mehmet";
        ogr1.soyadi="Demir";

        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
        System.out.println("ogr1.adi = " + ogr1.adi);
        System.out.println("ogr1.soyadi = " + ogr1.soyadi);

    }

}
