package Gun38._03_Abstract;

public class YemekDunyasiMain {
    public static void main(String[] args) { // her bir yemek için bir örnek oluşturulur ve isim, yapıldığı yer ve
                                             // tat bilgileri ekrana yazdırılır.

        Baklava bklv = new Baklava();
        System.out.println("Food : Baklava");
        System.out.println("Made in : " + bklv.madeIn());
        System.out.println("Taste : " + bklv.taste());
        System.out.println();

        // System.out.println(bklv.getClass().getSimpleName());
        // bklv.madeIn(); fakat void olması lazım çağırabilmek için
        // bklv.taste(); fakat void olması lazım çağırabilmek için

        CheeseCake cc=new CheeseCake();
        System.out.println("Food : Cheese Cake");
        System.out.println("Made in : " + cc.madeIn());
        System.out.println("Taste : " + cc.taste());
        System.out.println();

        // System.out.println(cc.getClass().getSimpleName());
        // cc.madeIn(); fakat void olması lazım çağırabilmek için
        // cc.taste(); fakat void olması lazım çağırabilmek için

        GreekSalad gs=new GreekSalad();
        System.out.println("Food : Greek Salad");
        System.out.println("Made in : " + gs.madeIn());
        System.out.println("Taste : " + gs.taste());
        System.out.println();

        // System.out.println(gs.getClass().getSimpleName());
        // gs.madeIn(); fakat void olması lazım çağırabilmek için
        // gs.taste(); fakat void olması lazım çağırabilmek için

        SezarSalad ss=new SezarSalad();
        System.out.println("Food : Sezar Salad");
        System.out.println("Made in : " + ss.madeIn());
        System.out.println("Taste : " +ss.taste());

        // System.out.println(ss.getClass().getSimpleName());
        // ss.madeIn();
        // ss.taste();

    }
}
