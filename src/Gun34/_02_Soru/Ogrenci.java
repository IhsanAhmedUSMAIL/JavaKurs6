package Gun34._02_Soru;

public class Ogrenci {
    private int id;
    private String isim;
    private  OgrTip tipi; // enum olacak (çünkü içinde bir kaç tip var dolayısıyla simge gibi kullanacağız)

    private static int sayaID=1; // private static int çünkü nesneden bağımsız,
                                 // sanki burda yokmuş gibi düşüneceğiz ama sürekli
                                 // canlı duran bir yapısı var.


    public Ogrenci(String isim, OgrTip tipi) {
        // this.isim = isim; kontrolden geçmesi gerektiği için setIsim(isim); olarak yaptık
        setIsim(isim);
        //this.tipi = tipi; kontrolden geçmesi gerektiği için setTipi(tipi); olarak yaptık
        setTipi(tipi);
        //this.id=sayaID++; sistemden geleceği için aslında setId(sayaID++); olarak yazılması
                           // zorunlu değil.
        setId(sayaID++);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci:" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi;
    }
}
