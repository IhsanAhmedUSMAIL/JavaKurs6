package Tekrar;

public class _03_stringİslemleri {

    public static void main(String[] args) {

        String tamAd="Ihsan Ahmed";

        String isim=tamAd.substring(0,4); // 0,1,2,3

        System.out.println("isim = " + isim);

        int boslukIndex=tamAd.lastIndexOf(" ");
        System.out.println("boslukIndex = " + boslukIndex);

        isim=tamAd.substring(0,boslukIndex);
        System.out.println("isim = " + isim);

        String soyisim=tamAd.substring(boslukIndex+1,tamAd.length());
        System.out.println("soyisim = " + soyisim);

        String soyisim2=tamAd.substring(boslukIndex+1); // 2 değer yoksa sonuna kadar gider
        System.out.println("soyisim2 = " + soyisim2);

        System.out.println("tamAd.charAt = " + tamAd.charAt(tamAd.length()-1)); // son karakteri verir

    }

}
