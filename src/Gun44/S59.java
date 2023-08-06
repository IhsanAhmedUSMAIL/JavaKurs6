package Gun44;

public class S59 {
    public static void main(String[] args) {

        int[] intArr={8,16,32,64,128};

        //runtime error
        //for(int i : intArr) // i=8,16,32,64, 128
        //System.out.println(intArr[i] + " ");

        for (int i: intArr) //i=8,16,32,64,128
            System.out.println(i+" ");

        //compile error
       // for (int i = 0: intArr) {
        //    System.out.println(intArr[i] + " ");
         //   i++;
       // }

        // for (int i = 0; i < intArr.length; i++) {
        //    System.out.println(i+ " "); // 0,1,2,3,4
        // }

        for (int i =0; i < intArr.length; i++){
            System.out.println(intArr[i]+ " ");
        }

        //compile error
      //  for (int i; i < intArr.length; i++)
       // {
      //      System.out.println(intArr[i]);
      //  }

    }
}
