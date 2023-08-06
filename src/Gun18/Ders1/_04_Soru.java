package Gun18.Ders1;

public class _04_Soru {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // butün doldurma işlemi bittikten sonra
        //sonrasında yazdırınız ve kaç tane tek sayı olduğını bulunuz
        
        int[][] tablo=new int[2][3];

        // Tabloyu random 100 e kadar sayılarla doldurunuz
        for (int satir = 0; satir < tablo.length ; satir++) { //tablo.length kaç satır olduğu bilgisini verir
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) { // tablo[satir].length kaç sutun olduğunu verir
                tablo[satir][sutun] = (int) (Math.random() * 100);

            }
        }
            for (int satir = 0; satir < tablo.length ; satir++) { //tablo.length kaç satır olduğu bilgisini verir
                for (int sutun = 0; sutun < tablo[satir].length; sutun++) { // tablo[satir].length kaç sutun olduğunu verir
                    System.out.print(tablo[satir][sutun] + " ");

                    System.out.println();

                }
            }
                // kaç adet tek sayı olduğunu yazdırmak için
                int tekSayiMik=0;
                for (int satir=0; satir < tablo.length; satir++) {

                    for (int sutun=0; sutun < tablo[satir].length; sutun++) {

                        if (tablo[satir][sutun] % 2 ==1 )
                            tekSayiMik++;
                    }
                }
        System.out.println("tek Sayı Miktarı = " + tekSayiMik);
        }
    }


