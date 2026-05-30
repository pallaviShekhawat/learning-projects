package dsa;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {5,10,20,15,30,16};
        int max = findMaxElement(arr);
        System.out.println("Maximum Element is :" +max);
    }
    public static int findMaxElement(int[] arr){
        int max = arr[0];
        for(int i=1 ; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
