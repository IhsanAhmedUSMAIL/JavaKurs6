package Gun16;

public class _01_JavaDiziNedir { // Array = Dizi

    public static void main(String[] args) {

        // birden fazla değer tutabilen bir değişken ihtiyacımız var.
        //Çözüm
        int [] notlar= new int[50]; // 50 tane int saklayabilen  notlar isimli değişken.(index mantığı ile çalışıyor(oda numarası 0 dan başlar))

        notlar[0]= 75;
        notlar[1]= 88;
        // .....
        // .....
        notlar[49]= 95; // en son eleman toplam eleman sayısı -1 length-1 dir böylede 0-49 indextir.
        // [50] deyip daha fazla bilgi saklarsak challanger patlar.
        // Buna dizi denir.

        System.out.println("notlar [0] = " + notlar[0]);
        System.out.println("notlar.length = " + notlar.length);



    }

}
