package Gun28._04_Ornek;

public class Banka {

    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka() {

    }

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String adi, int kurulusYili)
    {
        this(adi, kurulusYili,0);
    }

    public Banka(String adi) {
        this(adi,0,0);
    }

    @Override
    public String toString() {
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}
