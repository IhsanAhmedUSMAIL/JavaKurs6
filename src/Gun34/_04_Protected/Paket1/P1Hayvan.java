package Gun34._04_Protected.Paket1;

public class P1Hayvan {

    public String ad; // her yerden, bütün paketlerden ulaşılabilir.
    int yas; // bir şey yazılmadığı zaman default: sadece aynı paketten ulaşılabilir.
    protected String cinsi; // default gibi, ek olarak sadece bir yöntem (extend) ile diğer paketlerden ulaşılabilir
    private String renk; // sadece kendi bilinduğu class tan ulaşılabilir.

}
