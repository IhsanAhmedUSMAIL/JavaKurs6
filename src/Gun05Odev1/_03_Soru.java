package Gun05Odev1;

public class _03_Soru {

    public static void main(String[] args) {

        //String olarak verilen 3 taksit bilgisinin ortalamasını(ondalıklı olarak) bulunuz.("150","185","95")

        String Taksit1="150";
        String Taksit2="185";
        String Taksit3="95";

        int birinciTaksit1=Integer.parseInt(Taksit1);
        int ikinciTaksit2=Integer.parseInt(Taksit2);
        int ucuncuTaksit3=Integer.parseInt(Taksit3);

        int toplam=birinciTaksit1+ikinciTaksit2+ucuncuTaksit3;

        double ortalama=(double)toplam/3;
        System.out.println("ortalama = " + ortalama);


    }

}
