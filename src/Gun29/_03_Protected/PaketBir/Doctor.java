package Gun29._03_Protected.PaketBir;

public class Doctor {
    public String hastaneAd; //  diğer paketlerden erişim izni verildi
    String ad;// Default
    protected String bolumu;// default ile aynı
    private String SicilNo; // Private sadece class ın içinden erişilebilir

    Doctor() { // sadece kendi paketindekiler erişebilirler

    }

    public Doctor(String ad) { // diğer tüm paketlerden de erişilebilir
        this.ad = ad;
    }
}
