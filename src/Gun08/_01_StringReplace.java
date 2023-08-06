package Gun08;

public class _01_StringReplace {

    public static void main(String[] args) {

        // replace : bir string içindeki karakter(leri) verilenle değiştir. hepsini

        String text="Merhaba Dünya";
        System.out.println("text = " + text);
        System.out.println("text.replease(a,e) = " + text.replace("a","e")); //Merhebe Dünye
        System.out.println("text.replease(ba,de) = " + text.replace("ba","desss")); // Merhade Dünya
        System.out.println("text.replease (Merhaba,Hello) = " + text.replace("Merhaba","Hello"));
        System.out.println("text.replease(a,'') = " + text.replace("a","")); // a lar silindi

    }

}
