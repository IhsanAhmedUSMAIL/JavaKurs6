package Gun04;

public class _06_Ornek2 {

    public static void main(String[] args) {

        String bagis1="500";
        String bagis2="1500";

        // toplam bağış miktarı lazım.

        int rakamBagis1= Integer.parseInt(bagis1);  // harfleri parçalayıp rakama dönüştürüyor
        int rakamBagis2= Integer.parseInt(bagis2);
        int toplam=rakamBagis1+rakamBagis2;

        System.out.println("toplam = " + toplam);

    }
}
