package Gun16;

public class _04_JavaArray {

    public static void main(String[] args) {

        int[] dizi=new int[5]; // 0,1,2,3,4 indexli 5 elemanlı dizi tanımı, int sayi;
        int[] dizi2= {3,5,56,44,78}; // 5 elemanlı dizi, hem tanımlandı hem de değer atandı, int sayi=5;
        // yani dışardan okuman gerekmiyorsa.

        String[] cumleler=new String[5]; // 5 tane cumle saklayabilen bir string dizi değişkeni
        boolean[] dizi3=new boolean[5]; // 5 tane (true/false) saklayabilen bir dizi değişkeni
        double[] oranlar=new double[5]; // 5 tane double saklayabilen bir dizi değişkeni.

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi = " + dizi[i]);
        }

        for (int i = 0; i < cumleler.length; i++) {
            System.out.println("cumleler = " + cumleler[i]);

        }

        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("dizi3 = " + dizi3[i]);

        }

        for (int i = 0; i < oranlar.length; i++) {

            System.out.println("oranlar = " + oranlar[i]);

        }

    }

}
