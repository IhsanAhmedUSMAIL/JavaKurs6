package Gun04;

public class _05_Ornek1 {
    public static void main(String[] args) {

        int bolunen=10;
        int bolen=3;

        double sonuc= bolunen / bolen; // 10/3
        double sonuc1= (double)bolunen / bolen; // herhangi birine (double) eklememiz ondalıklı sonuç almamız için yeterlidir.

        System.out.println("sonuc = " + sonuc); // 3 her zaman tam sayı kısmını verir
        // kural int/int sonucu herzaman int dir.

        int sayi1=10;
        int sayi2=3;

        int tamSonucu2= sayi1/sayi2; // int/int -> int sonucu verir bilgisayarın kuralı olarak

        /*********************/

        int s1=10;
        int s2=3;

        double doubleSonuc= s1/(double)s2; // ikisinden birinde (double) eklememiz yeterli - int/double -> double sonuc
        System.out.println("doubleSonuc = " + doubleSonuc);


    }
}
