package Gun08;

public class _02_StringReplaceFirst {

    public static void main(String[] args) {

        // replaceFirst : bir string içindeki karakter(leri) verilenle değiştir.sadece ilkini değiştirir

        String text="Merhaba Dünya";

        System.out.println("text = " + text);
        System.out.println("text.replaceFirst(a,e) = " + text.replaceFirst("a","e") ); //Merhebe Dünya
        System.out.println("text.replaceFirst(ba,de) = " + text.replaceFirst("ba","de")); //Merhade Dünya
        System.out.println("text.replaceFirst(Dünya,Java) = " + text.replaceFirst("Dünya","Java"));
        System.out.println("text.replaceFirst(a,'') = " + text.replaceFirst("a",""));


    }

}
