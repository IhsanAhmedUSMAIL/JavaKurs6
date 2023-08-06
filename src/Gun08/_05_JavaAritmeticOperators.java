package Gun08;

public class _05_JavaAritmeticOperators {

    public static void main(String[] args) {

        int sayac=0;

        sayac=sayac+1; // sayac değeri 1 tane artıyor:1
        sayac++ ;      // sayac değeri 1 tane artıyor:2
        ++sayac ;      // sayac değeri 1 tane artıyor:3

        sayac=sayac-1; // sayacın değerini 1 azaltır : 2
        sayac-- ;      // sayacın değerini 1 azaltır : 1
        --sayac ;      // sayacın değerini 1 azaltır : 0

        System.out.println("sayac = " + sayac);




        /********************/
        int toplam=0, sayi=0;
        //işlemden önce : toplam=0, sayi=0
        toplam= 5+sayi;
        //işilemden sonra : toplam=5, sayi=0;

        /*********************/
        toplam=0; sayi=0;

        //işlemden önce : toplam=0, sayi=0
        toplam = 5 + sayi++;
        // işlemden sonra: toplam=5, sayi=1

        //toplam =5+sayi;
        //sayi++;

        /***********************/
        toplam=0; sayi=0;
        // işlemden önce : toplam=0, sayi=1
        toplam=5 + ++sayi;
        // işlemden sonda : toplam=6, sayai=1

        sayi++;
        toplam=5 + sayi;
        // özet : ++ önde ise önce artır sonra işlem yap ++ sonda ise işlemden sonra artır demek


    }

}
