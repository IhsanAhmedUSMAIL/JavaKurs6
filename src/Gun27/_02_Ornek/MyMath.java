package Gun27._02_Ornek;

public class MyMath {

    public static int getMax(int a, int b) {
    return (a>b ? a : b); // a b den büyük ise a yı gönder değilse b yi gönder
    }

    public static int getMin(int a, int b) {
        return (a<b ? a:b);
    }
    public static double getPow(int a, int b) {
        return Math.pow(a,b);
    }

    public static double getSqrt(int a) {
        return Math.sqrt(a);
    }

    public static int getRandom(int sinir) {
        return (int) (Math.random()*sinir);
    }

}
