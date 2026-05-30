package dsa;

public class CountOccuranceElement {
    public static void main(String[] args) {
        int[] arr = {25,35,45,55,65,45,55,45,45,55,55,55};
        int target = 55;

        int count = occuranceCount(arr,target );
        System.out.println("Count of occurance element:" +count);
    }
    public static int occuranceCount(int[] arr , int target){
        int count = 0;
        for (int num :arr){
            if(num == target)
                count++;
        }
        /*for(int i=0; i<arr.length; i++){
            if (arr[i] == target) {
                count++;
}
        }*/
        return count ;
    }


}

