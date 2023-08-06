package Gun36._06_Interface;

public class GeoMain {
    public static void main(String[] args) {

        Dikdortgen d=new Dikdortgen();
        System.out.println(d.alan(5,6));
        System.out.println(d.cevre(5,6));

        Kare k=new Kare();
        System.out.println(k.alan(5));
        System.out.println(k.cevre(6));

    }
}
