package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {

        byte ogrNot1=98;
        byte ogrNot2=97;
        byte ogrNot3=99;
        byte ogrNot4=100;

          //int         // byte
        int toplamNot=ogrNot1+ogrNot2+ogrNot3+ogrNot4;
        //int hafızadaki alanı büyük

        byte toplam2= (byte) toplamNot;
        ogrNot2 = (byte)toplamNot; // 394 ü byte alanına atıyor fakat yanlış dönüşüm
        System.out.println("ogrNot2 = " + ogrNot2);

        // int -> byte atınca dur bakalım dedi   (DARALTMA)
        // büyük hafıza ayrılmış bir alanı, küçük hafıza ayrılmış alana atma
        // işlemi var. veri kaybı ihtimali var

        //ondalikli bir sayinin sadece tam sayi kismi gerekebilir bu durumda double int e cevirmen gerekiyor
        // 10/3 -> 3 10/(double)3 -> 3.333

    }
}
