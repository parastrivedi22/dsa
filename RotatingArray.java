

/*
left rotation: we will use recursion method to solve this problim
space complexity will be O(1)
and time complexity : O(N)

eg. have a with length len;
we want rotate array n time;

what will do here

step 1 reverse 0 to n-1 part of array;
step 2 reverse n to len-1 part of array;
step 3 reverse whole array; 0 to len;

write function eftRotation(int[] arr, int len, int n)
    call reverse function two time

    1> call reverse function for 0 to n-1;
    2> call reverse function for n to len-1;
    3> call rervser function for 0 to len-1;


write  private static void reverse(int[] arr, int i, int j) {
    swap elements;


 */


import java.util.Arrays;

public class RotatingArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int len = arr.length;
        int n = 2;

        leftRotation(arr, len, n);

        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotation(int[] arr, int len, int n) {
        reverse(arr,0, n-1);
        reverse(arr, n, len-1);
        reverse(arr,0, len-1);
    }

    private static void reverse(int[] arr, int i, int j) {
        //
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
