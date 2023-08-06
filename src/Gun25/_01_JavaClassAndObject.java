package Gun25;

class Ogrenci{

int okulNo;
String adi;
String soyadi;
int sinifi;
String Adresi;
String telefonu;  // yer kaplamaması için String olarak kullanıldı (sonuçta hesaplama vb. işlemler için kullanılmadığından)

}

// class tiplerin tanımlandığı yer
public class _01_JavaClassAndObject {

    //metodların yazılabildiği yer

    public static void main(String[] args) { // başla
        // ana programın çalıştığı yer
        Ogrenci ogr1=new Ogrenci();
        ogr1.okulNo=1001;
        ogr1.adi="Ahmet";
        ogr1.soyadi="Yılmaz";
        ogr1.Adresi="Başiskele/Kocaeli";
        ogr1.telefonu="05434636875";
        ogr1.sinifi=6;

        System.out.println("ogr1.adi = " + ogr1.adi);
        System.out.println("ogr1.soyadi = " + ogr1.soyadi);

    }// Dur

    //metotların yazılabildiği yer

}
