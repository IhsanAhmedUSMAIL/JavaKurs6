package Gun19;

public class _05_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz(); // Math.Random(); benziyor. Birşey almadan veriyor
        merhabaYaz();

        merhabaYazIhs("Ihsan");
        cokMerhabaYaz(5);
    }
    public static void merhabaYaz(){ // main de çağırırsan ekrana yazar yoksa yazmaz merhabaYaz();
        System.out.println("Merhaba Dünya");
    }

    public static void merhabaYazIhs(String ad){
        System.out.println("Merhaba " + ad);
    }

    public static void cokMerhabaYaz(int miktar){
        for (int i = 0; i < miktar; i++)
            System.out.println("Merhaba ");
    }

}
