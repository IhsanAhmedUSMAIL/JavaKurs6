package Gun30._02_finalVariables.Ornek2;

public class Vatandas {

    int TcNo;
    String isim;
    String adres;

    private static int TcNoSayac=1;

    public Vatandas(String isim, String adres) {
        this.isim = isim;
        this.adres = adres;
        this.TcNo=TcNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "TcNo=" + TcNo +
                ", isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
