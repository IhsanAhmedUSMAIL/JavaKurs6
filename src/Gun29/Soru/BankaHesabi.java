package Gun29.Soru;

public class BankaHesabi {

    private int yatan;
    private int cekilen;
    private int bakiye;

    public void paraYatir(int yatanPara)
    {
        this.yatan=this.yatan+yatanPara;
        this.bakiye=this.bakiye+yatanPara;
    }

    public void paraCek(int cekilenPara)
    {
        this.cekilen=this.cekilen+cekilenPara;
        this.bakiye=this.bakiye-cekilenPara;
    }

    @Override
    public String toString() {
        return "BankaHesabi{" +
                "Toplam yatan=" + this.yatan +
                ", Toplam cekilen=" + this.cekilen +
                ", Toplam bakiye=" + this.bakiye +
                '}';
    }
}
