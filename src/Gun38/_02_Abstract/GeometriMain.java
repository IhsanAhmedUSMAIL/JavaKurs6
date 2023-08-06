package Gun38._02_Abstract;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen(4,5);
        d.setName("Yeni Dikdörtgen");
        d.ciz();
        System.out.println(d);

        System.out.println("------------");

        Daire dr=new Daire(4);
        dr.setName("Yeni Daire");
        dr.ciz();
        System.out.println(dr);
    }
}
