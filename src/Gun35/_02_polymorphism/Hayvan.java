package Gun35._02_polymorphism;

public class Hayvan {
    private String name;

    public Hayvan(String name) {
        this.name = name;
    }

    public void ses() { // metod
        System.out.println("Ses çıkardı.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
