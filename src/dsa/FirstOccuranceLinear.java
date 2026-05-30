package dsa;

public class FirstOccuranceLinear {
    public static void main(String[] args) {
        int[] arr ={10,30,45,55,30,45,55};
        int target =45 ;
        int index = firstOccurance(arr,target);
        System.out.println("Index of first occurance: " +index);
    }
    public static int firstOccurance(int[] arr, int target){
        for (int i =0; i<arr.length ; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1 ;
    }
}
