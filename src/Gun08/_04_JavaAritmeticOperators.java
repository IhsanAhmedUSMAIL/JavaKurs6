package Gun08;

public class _04_JavaAritmeticOperators {

    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("Toplama işlemi");
        System.out.println("a+b sonucu = " + (a+b)); //14

        System.out.println("Çıkartma işlemi");
        System.out.println("a-b sonucu = " + (a-b)); // 4

        System.out.println("Çarpma işlemi");
        System.out.println("axb sonucu = " + (a*b)); //45

        System.out.println("Bölme işlemi");
        System.out.println("a/b sonucu = " + (a/b));
        // normal sonuc 1.8, fakat bilgisayar 2 si de tam sayi tipinde ise, küsüratı atar
        //bu sebeple sonuç 1 olur, yuvarlama yapmaz, int/int = int verir
        // küsüratlı sonuç istiyorsan, işleme girenlerden en az birisi double olmalı
        System.out.println("(double)a/b = " + (double)a/b); // double herhangi birine yazabilirsin sonuc =1.8

        /**************************/

        System.out.println("Mödül işlemi : bölümden kalan demek");
        System.out.println("a%b = " + a%b); //4
        System.out.println("b%a = " + b%a); // bölünemediği için sadece sayının kendisini alırsın 5%9 sonuç = 5



    }

}
