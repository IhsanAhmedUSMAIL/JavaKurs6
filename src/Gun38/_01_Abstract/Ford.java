package Gun38._01_Abstract;

//nesne üretilecek olan class, tip
public class Ford extends BinekOto { // implementi abstract içine gömdük
    public Ford(String marka, int uretimYili, int vitesAdedi) {
        super(marka, uretimYili, vitesAdedi);
    }

    @Override
    int hizlanmaSuresi() {

        return 0;
    }
}
