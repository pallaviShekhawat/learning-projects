package dsa;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {10, 50, 65, 55, 85, 100};
        int target = 55;

        LinearSearch obj = new LinearSearch();
        int index = obj.checktarget(arr, target);

        System.out.println("Target Value is found at : arr[" + index + "]" );
    }

    public int checktarget(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
