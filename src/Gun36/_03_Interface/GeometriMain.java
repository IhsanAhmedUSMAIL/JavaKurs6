package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c=new Cember();
        c.ciz(); // Çember çizildi

        Dikdortgen d=new Dikdortgen();
        d.ciz(); // Dikdortgen çizildi

        // interface lerden nesne üretilemez fakat referans tipi
        // oluşturulabilir. Bu bize polymorphism sağladı.
        ICizdirir c2=new Cember();
        c2.ciz(); // çember çizildi
        // direkt olarak sadece Interface deki
        // ismi verilmiş olanlar metodlara erişebilirsin

        cizdir(c); // çember çizildi
        cizdir(d); // dikdörtgen çizildi

    }

    public static void cizdir(ICizdirir g)
    {
    g.ciz();
    }
}

