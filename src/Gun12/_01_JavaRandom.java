package Gun12;

public class _01_JavaRandom {

    public static void main(String[] args) {

        // Math.Random() : double sayı üretir. 0 - 0,99999999 arası üretiyor

        // Math.random(); // double sayı üretir. 0 - 0,9999999999 arası sayı üretiyor.

        double randSayi= Math.random(); // 0 - 0,99999999999
        System.out.println("randSayi = " + randSayi);

        // 0 - 0,99999999
        // 10 la çarparsam
        // 0 - 9,99999999
        // (int) 0 - 9

        int randTamSayi= (int) (randSayi*10);
        System.out.println("randTamSayi = " + randTamSayi);



    }

}
