package Gun32._01_Encapsulation;

public class Kisi {
    String ad; // genelde 25 karakter sınırı var
    String Soyad; // genelde 25 karakter sınırı var
    private int yas;

    public void yasAta(int yas)
    {
        if (yas<0)
            System.out.println("Hatalı giriş");
        else
            this.yas=yas;
    }

    public void setAd(String ad)
    {
        if (ad.length() < 25)
            this.ad=ad;
        else
            System.out.println("Hatalı giriş");
    }

    public void setSoyad(String soyad)
    {
        if (soyad.length() <25 )
        this.Soyad=soyad;
        else
            System.out.println("Hatalı giriş");
    }
// kontrollu bir şekilde verilerin atılmasını sağladık
// ve korumaya aldık. (String ad; String Soyad; private int yas; )
    public int yasVer()
    {
        return this.yas;
    }
    public String getad()
    {
        return this.ad;
    }

    public String getSoyad()
    {
        return this.Soyad;
    }

}
