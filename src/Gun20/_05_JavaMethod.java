package Gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1=5;
        int s2=4;
        double d1=1.2;
        double d2=2.5;

        int sonuc1= topla(s1,s2);
        double sonuc2= topla(d1, d2);
        //topla(); // içinde hangi değerleri ekledi isen  metodda tanımladığın için tipine göre davranıyor
        // metodlara aynı isim verebiliriz, yeter ki parametreden ayırt edebilsin
    }

    public static int topla(int s1, int s2)
    {
        return s1+s2;
    }

    public static double topla(double s1, double s2)
    {
        return s1+s2;
    }
}
