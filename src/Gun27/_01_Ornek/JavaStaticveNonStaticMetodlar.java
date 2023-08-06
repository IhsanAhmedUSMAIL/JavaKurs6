package Gun27._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {

        Utility.getString2(56);

        Utility ut=new Utility(); //ut: nesne
        ut.getrString(56);

        //static metodlar: class a yani tipe ait.
        // Bu sebeple tipin adı ile çağrılırlar.

        //static olmayanlar: nesneye ait.
        // Bu sebeple nesne adı ile çağrılırlar.



    }
}
