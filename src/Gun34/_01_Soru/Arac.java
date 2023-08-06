package Gun34._01_Soru;

public class Arac { // super, base , parent
    private String renk;
    private  double motorHacmi;
    private String marka;

    public Arac(String renk, double motorHacmi, String marka) {
        setRenk(renk); // kendimiz düzenledik.
        setMotorHacmi(motorHacmi); // kendimiz düzenledik.
        setMarka(marka); // kendimiz düzenledik.
    }

    public String getRenk() {
        return renk;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override // özelleştirme
    public String toString() {
        return "Arac" +" : "+
                "renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", marka='" + marka + '\'' ;
    }
}
