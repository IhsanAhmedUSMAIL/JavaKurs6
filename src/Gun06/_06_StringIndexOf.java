package Gun06;

public class _06_StringIndexOf {

    public static void main(String[] args) {

        // IndexOf : verilenkarakter(lerin) indexini verir
        // 01234   : harflerin oda numarası
        // Bugün

        String cumle="Merhaba Dünya";
        // h nin oda numarası kaç : 3
        // a nin oda numarası kaç : 4
        // Dü nün indexi kaç : 8

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); //0
        System.out.println("cumle.indexof(h) = " + cumle.indexOf("H")); //3
        System.out.println("cumle.indexof(a) = " + cumle.indexOf("A")); //4
        System.out.println("cumle.indexof(Dü) = " + cumle.indexOf("Dü")); //8
        System.out.println("cumle.indexof( ) = " + cumle.indexOf(" ")); //7
        System.out.println("cumle.indexof(A) = " + cumle.indexOf("A")); //-1 yok manasında

        System.out.println("cumle.indexod(a,5) = " +cumle.indexOf("a",5));//6
        // 5 nolu indexten sonra a hangi oda da

        System.out.println("cumle.indexof(a,7) = " + cumle.indexOf("a",7));//12
        // 7 nolu indexten sonra a yı ara

    }

}
