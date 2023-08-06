package Gun03;

public class _02_Ornek1 {
    public static void main(String[] args) {
         // bir karenin kenar uzunluğu 5 dir. Karenin çevresini ve alanını hesaplayıp yazdırınız
        // cevre=kenar+kenar+kenar+kenar yani=cevre*4;
        // alan= kenar*kenar
        int kenar=5; // değişkeni tanımladık ve ana 5 değerini atadık

        int alan=kenar*kenar;
        int cevre=kenar*4;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

    }
}
