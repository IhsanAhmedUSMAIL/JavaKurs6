package Gun13Odev6;

public class _05_SoruOdv6 {

    public static void main(String[] args) {

        //5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        int sayac=1;
        int besRakam=0;


        while (sayac<=100)
        {
            int birlerBas=sayac%10;
            if (birlerBas==5)
            {
                besRakam=besRakam+1;
            }
            sayac++;
        }
        System.out.println("100 e kadar olan birler 5 basamağı = " + besRakam);
    }

}
