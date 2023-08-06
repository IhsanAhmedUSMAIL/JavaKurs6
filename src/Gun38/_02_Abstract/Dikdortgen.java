package Gun38._02_Abstract;

public class Dikdortgen extends Sekil{

    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        // alttaki get ve set leri çağırdık
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }
    @Override
    double alan() {
        return this.uzunKenar*this.kisaKenar;
    }

    @Override
    double cevre() {
        return (this.uzunKenar+this.kisaKenar)*2;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }


}
