package Gun44;

public class S24 {
    public static void main(String[] args) {

        String [] strs=new String[2];
        //strs[0]=""; // olmayan bir şeye atamaya şalışıyoruz çıktı olarak null yazar
        //strs[1]=""; // olmayan bir şeye atamaya şalışıyoruz çıktı olarak null yazar

        int idx=0;
        for (String s : strs) {
            strs[idx].concat("element" +idx);
            // strs[idx] = strs[idx].concat("element" +idx); // concat için atama yapmamız lazım çıktı alabilmek için
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++)
        {
            System.out.println(strs[idx]);
        }
    }
}
