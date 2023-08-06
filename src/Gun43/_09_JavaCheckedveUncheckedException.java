package Gun43;

public class _09_JavaCheckedveUncheckedException {
    public static void main(String[] args) {

        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.

        String kelime="";

        char ilkHarf=kelime.charAt(0); // Zorunlu değil, Unchecked Exception



        try {
            Thread.sleep(1000); // mecbut tryCatch isteyen metodlara Checked Exception diyoruz
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
