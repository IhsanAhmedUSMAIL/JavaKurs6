package Gun35._03_Polymorphism_Soru;

public class OkulMain {

    public static void main(String[] args) {

        Ogrenci ogr=new Ogrenci("Ayşe","Yılmaz","Öğrenci", "5A");
        Calisan cal=new Calisan("Ihsan","USMAIL", "Tester", "IT");

        Kisi.kimlikBelgesiYazdir(ogr);
        Kisi.kimlikBelgesiYazdir(cal);

    }

}
