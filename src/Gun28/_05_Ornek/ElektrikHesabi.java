package Gun28._05_Ornek;

public class ElektrikHesabi {

    int toplamTuketim=0;
    double birimFiyat=20;

    public void tuketimEkle (int tuketim) {
        toplamTuketim=toplamTuketim+tuketim;
    }
public void faturaYaz()
{
    double tuketimTL=toplamTuketim*birimFiyat;
    System.out.println("*****************");
    System.out.println("Faturanız");
    System.out.println("*****************");
    System.out.println("toplamTuketim = " + toplamTuketim);
    System.out.println("tuketimTL = " + tuketimTL);
}

}
