package Gun29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {

        Calisan cal1=new Calisan();
        cal1.id=1;
        cal1.name="Ihsan";
        cal1.surname="USMAIL";
        //cal1.password="1234";

        cal1.sifreAta("1234");
        cal1.sifreAta("M123_sdf23");
        cal1.sifreGoster();
    }
}
