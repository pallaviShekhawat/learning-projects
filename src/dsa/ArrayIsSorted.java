package dsa;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr ={10,20,25,35,45};
        boolean result = isSorted(arr);
        if(result){
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not Sorted");
        }
    }
    public static boolean isSorted(int[] arr){
        for (int i = 0; i<arr.length-1 ;i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
