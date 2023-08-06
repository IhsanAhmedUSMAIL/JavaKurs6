package Gun06;

public class _07_StringLastIndexOf {

    public static void main(String[] args) {

        // indexOf : Baştan itibaren arayıp oda numarasını döndürür
        // lastIndexOf : sondan itibareb aramaya başlar

        //            0123456789012
        String cumle="Merhaba Dünya";

        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.lastIndexof(a) = " + cumle.lastIndexOf("a")); // 12
        // index her zaman tektir, arama yönüne göre değişmez

        System.out.println("cumle.lastIndexof(a) = " + cumle.lastIndexOf("a", 8)); //6
        // sondan gelerek aramaya 8 nolu odadan başlar

    }

}
