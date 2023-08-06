package Gun29._03_Protected.PaketBir;

public class saglikBakanligi {
    public static void main(String[] args) {
        Doctor dok1=new Doctor();
        dok1.hastaneAd="Numune Hastanesi";
        dok1.ad="Ihsan";
        dok1.bolumu="Dahiliye";
        // dok1.SicilNo private olduğu için erişilemedi

        Doctor dok2=new Doctor( "Adil");

    }
}
