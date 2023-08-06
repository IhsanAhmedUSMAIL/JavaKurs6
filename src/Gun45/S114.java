package Gun45;

public class S114 {

    public static void main(String[] args) {

        int numbers[];   // int sayi;
        numbers=new int[2]; // sayi=5;
        numbers[0]=10;
        numbers[1]=20;

        numbers = new int[4]; // int başında olsaydı hata verirdi çünkü yeni aynı isimli numbers tanımlamış olurdun
        // fakat burda yukardaki numbers sıfırlandı ve 4 elemanlı oldu 0,0,0,0
        numbers[2]=30;
        numbers[3]=40;

        for (int x : numbers){
            System.out.println(" "+ x);
        }

    }

}
