package Gun43;

public class _07_TryCatchFinaly {
    public static void main(String[] args) {

        String str="" ;
        long startTime=0; // int, long, float, double
        try {

            startTime=System.currentTimeMillis();
            System.out.println("hatadan önceki kısım");
            char ilkHarf = str.charAt(0);
            System.out.println("Hatadan sonraki kısım");
        }
        catch (Exception ex) {
            System.out.println("catch bloğu çalıştı");
            // hata olduğunda yapılacaklar
        }
        finally { // hata olsa da olmasa da çalışıyor
            // try catch bloğuyla ilgili kodlar yazılır
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
            System.out.println(System.currentTimeMillis()-startTime);
        }

        System.out.println("diğer çalışacak kodlar");
        System.out.println("program bitti");
    }
}
