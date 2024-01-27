package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {20,15,5,11,1};
        System.out.println(Arrays.toString(arr));
        doBubbleSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    private static void doBubbleSort(int[] arr) {
        for(int i=0;i< arr.length;i++){
            for (int j=1;j< arr.length;j++){
                if(arr[j-1]>arr[j]){
                    swapElements(arr,j-1,j);
                }
            }
        }
    }

    private static void swapElements(int[] arr, int a, int b) {
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;


    }

}
