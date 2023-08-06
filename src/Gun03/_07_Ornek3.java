package Gun03;

public class _07_Ornek3 {
    public static void main(String[] args) {

        // kisinin kilosunu (Kg) ve boyunu (cm) kendiniz veriniz.
        // ekrana kilonuz : .... ve boyunuz= .... yazdıktan sonra
        // vucut kitle indeksini bulunuz : kilo/(boy*boy)

        double kilo=65.4;
        double boy=1.65;

        double KitleIndex= kilo/(boy*boy); // işlem 1 tane ondalıklı girdiğinde sonuç double dir
        System.out.println("Kilonuz=" + kilo + ", boyunuz=" + boy);
        System.out.println("KitleIndex = " + KitleIndex);
        System.out.println("arkadaş durumun normal ama üzüm yemeye devam");

    }
}
