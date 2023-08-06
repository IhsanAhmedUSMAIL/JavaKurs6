package Gun35._01_Final.metod;

public class Araclar {
    private String model;

    public Araclar(String model) {
        this.model = model;
    }

    public final void setKilometre() { // final metod
        System.out.println("Gösterge set edildi");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Araclar{" +
                "model='" + model + '\'' +
                '}';
    }
}
