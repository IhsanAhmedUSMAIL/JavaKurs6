package Gun34._01_Soru;

public class Otobus extends Arac{

    private int yolcuKapasitesi;

    public Otobus(String renk, double motorHacmi, String marka, int yolcuKapasitesi) {
        super(renk, motorHacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return super.toString()+", yolcu kapasitesi:"+this.yolcuKapasitesi;
    }
}
