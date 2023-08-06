package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {

        int sayi; // hafızada int kadar yer kaplar, sadece tam sayı atılabilir
        // tam sayılarda default int

        //tam sayilar
        byte byteDeger=7; // -128-127
        short shortDeger=1645; // -32000 - 32000
        int intDeger=250000;
        long longDeger=3232323232323l; //l Long oldugunu belirtir büyük veya küçük L fark etmez
        // ondalıklı sayıların defaultu double
        //ondalikli sayilar
        double doubleDeger= 3.46545645645645; // noktadan sonra 16 haneye kadar hassasiyet sayar
        float floatDeger= 3.121212f; // noktadan sonra 5 hane hassasiyeti var ama kararsızdır
        // en çok int ve double kullanılır

        // karakter ve harfler
        char basHarf='A'; // bir tane harf saklayabilir
        String isim="ihsan"; // kelime veya cümle saklayabilir, uzunlugu degisken

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);
    }
}
