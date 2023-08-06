package Gun43;

public class MyFunc {
    public static int enbBul(int s1, int s2) {

        int enb;

        if(s1>s2)
            enb=s1;
        else
            enb=s2;

        return enb;

    }

    public static int rndTamSayi(int sinir) {
        int rndSayi= (int) (Math.random()*(sinir+1));

        return rndSayi;
    }

    public static void bekle(int sn) {
        try {
            Thread.sleep(1000*sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
