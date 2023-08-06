package Gun31._01_enum;



    enum  Aylar {
        // enum SİMGE OLARAK TANIMLIYOR.Hata yapma olasılığımız azalıyor.
        Tanimzis, OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN, TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
    }
public class Ornek1Cozum {
     //enumaration : numaralandırılmış simgeler
    // class in  içinde de enum tanımlanabilir. Metodların içinde tanımlanamaz.
    public static void main(String[] args) {

        Aylar ay=Aylar.MAYIS;

        switch (ay) {
            case SUBAT: System.out.println(28); break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK: System.out.println(31); break;
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL: System.out.println(30); break;

        }

        if (ay == Aylar.MAYIS)
            System.out.println("Zam ayı");

        System.out.println("ay = " + ay); // toString. simge mayıs
        System.out.println("ay = " + ay.name()); // simge mayıs
        System.out.println("ay = " + ay.ordinal());

        for (Aylar a :  Aylar.values())
                System.out.println(a.name() +" - " + a.ordinal());


    }



}
