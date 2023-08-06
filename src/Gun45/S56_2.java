package Gun45;

public class S56_2 {
    public static void main(String[] args) {

        String names[] = {"Thomas", "Peter","Joseph"};
        String pwd[] = new String[3];
        int idx=0;
        for (String n : names) {
        try {

                pwd[idx] = n.substring(2,6); // 2 den 5 e kadar dahil edilmiş oluyor
                System.out.println(pwd[idx]); // omas yazıldı
                idx++;

        }catch (Exception e)
        {
            System.out.println("Invalid Name"); // Invalid Name
        }
        } // for döngüsünü dışarıya aldığımız için 3 kez dönecek
        // Çıktısı omas, Invalid Name, seph
        // hhata olan satırdan sonraki satırlar çalışmaz

        for (String s : pwd)
            System.out.println("s = " + s); // çıktısı s = omas, s = seph, s = null
    }

}
