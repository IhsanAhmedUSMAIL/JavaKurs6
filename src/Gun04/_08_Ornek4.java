package Gun04;

public class _08_Ornek4 {

    public static void main(String[] args) {

        // rakamların yazıya çevrilmesi yani int to String

        String ad= "Ihsan USMAIL";
        int sinifNo=5;
        char subesi='A'; // TEK TIRNAK HARF DEMEK
        boolean gectiMi=true;

        System.out.println(ad+" "+sinifNo+" "+subesi+" "+gectiMi);
        // + nın herhangi bir tarafında string var ise, diğer değişken otomatik stringe dönüşür.

        System.out.println("merhaba"+1+2); // merhaba12 (1+2) parantez içinde olsaydı 3merhaba yazardı
        System.out.println(1+2+"merhaba"); // 3merhaba
        // yani birleştirme işlemi herzaman soldan sağa doğru gider.



    }

}
