package Gun16;

public class _06_JavaArray {

    public static void main(String[] args) {

        // 5 tv kanalı ismini bir diziye doldurunuz.trt, kanald, atv, fox, habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazdırınız.

        String[] tvler= {"trt", "kanald", "atv", "fox", "habertürk"};

        int rndIndex=(int)(Math.random()* tvler.length); // 5 e kadar 0,1,2,3,4

        System.out.println("Rastgele seçilen tv = " + tvler[rndIndex]);

        // TODO: gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz
        // TODO: fakat bir bulundu tekrar bulunmasın.
    }

}
