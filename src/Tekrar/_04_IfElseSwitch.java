package Tekrar;

public class _04_IfElseSwitch {

    public static void main(String[] args) {

        int sayi1=5;
        int sayi2=7;

        boolean esitMi=(sayi1==sayi2);
        System.out.println("esitMi = " + esitMi);

        if (sayi1==sayi2)
            System.out.println("Eşit");
        else
            System.out.println("Değil");

        String sifre1="merhaba";
        String sifre2="merhaba";

        if (sifre1.equals(sifre2))
            System.out.println("Hoşgeldiniz");
        else
            System.out.println("hatalı şifre");

        // kullanıcıdan alınan günNo ya göre adını yazınız.
        int gunNo=1;

        if (gunNo==1)
            System.out.println("Pazartesi");
        else
            if (gunNo==2)
                System.out.println("salı");
            else
                if (gunNo==3)
                    System.out.println("Çarşamba");

                switch (gunNo){

                    case 1: System.out.println("Pazartesi");break;
                    case 2: System.out.println("Salı");break;
                    case 3: System.out.println("Çarşamba");break;
                    case 4: System.out.println("Perşembe");break;
                    case 5: System.out.println("Cuma");break;
                    case 6: System.out.println("Cumartesi");break;
                    case 7: System.out.println("Pazar");break;
                    default: System.out.println("Hatalı giriş");

                }

            } ;


    }


