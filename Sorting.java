public class Sorting {

    static void printArr(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] bubbleSort(int[] arr){
        printArr(arr);
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length-2; i++) {
            int minValue=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minValue]) minValue = j;
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    
    public static void main(String[] args) {
        int [] arr = {9,7,5,3,99,1,3,5,2,4,89};
        
        // printArr(selectionSort(arr));

        printArr(bubbleSort(arr));
    }
}
