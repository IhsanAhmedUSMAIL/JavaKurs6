package Tekrar;

public class _05_soru {

    public static void main(String[] args) {

        // bu cümleyi tersten yazdırınız

        String cumle="Bu gün hava güzel";

        //length -1 den başlıyor 0 kadar : for
        for (int i=cumle.length()-1 ; i>=0 ; i-- )
            System.out.println(cumle.charAt(i));

        // bir cümlede aranan bir harf kez kullanılıyor

        char arananHarf='n';
        int tekrarSayisi=0;
        for (int i=0; i<cumle.length(); i++) {

            String aranan= Character.toString(arananHarf).toUpperCase();
            String cumleninHarfString= Character.toString(cumle.toUpperCase().charAt(i));

            // String aranan=arananHarf+""; sondaki ek otomatik stringe çeviriyor
            // String cumleninHarfString=cumle.toUpperCase().charAt(i)+""; sondaki ek otomatik stringe çeviriyor

            if (cumleninHarfString.equalsIgnoreCase(aranan))
                tekrarSayisi++;
        }
        System.out.println("tekrarSayisi = " + tekrarSayisi);


    }

}
