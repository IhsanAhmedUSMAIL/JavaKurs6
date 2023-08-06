package Tools;

public class MyFunc {

    public static int enbBul(int s1, int s2) {
        int enb=0;

        if (s1>s2)
            enb=s1;
        else
            enb=s2;
        return enb;
    }

    public static int rndTamSayi (int sinir) {
        int rndSay= (int) (Math.random()*(sinir+1));

        return rndSay;
    }


}
