package dsa;

public class Leanersearch {
    public static void main(String  [] pallavi ) {
        int[] arr = new int[]{1,2,3,4,5,60,1,3,4};
        int tr = 60;
        Leanersearch obj = new Leanersearch();
        int a = obj.checktarget(arr,tr);
        System.out.println("value is : " +a);

    }


    public int checktarget(int[] arr , int tr){
        int n = arr.length;
        for(int i = 0 ; i<n;i++) {
            if(arr[i]==tr){
              // System.out.println("value is found  " + i);
                return i;
            }
        }
            return -1 ;
    }
}