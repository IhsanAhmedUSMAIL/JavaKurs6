package Gun05Odev1;

public class _02_Soru {

    public static void main(String[] args) {

        //String olarak verilen 3 adet paranın toplamını bulunuz ("100", "200", 300)

        String Para1="100";
        String Para2="200";
        String Para3="300";

        int rakamPara1= Integer.parseInt(Para1);
        int rakamPara2= Integer.parseInt(Para2);
        int rakamPara3= Integer.parseInt(Para3);

        int toplam=rakamPara1+rakamPara2+rakamPara3;
        System.out.println("toplam = " + toplam);

    }

}
