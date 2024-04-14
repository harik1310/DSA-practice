public class Recursion {

    static void print(int val,int start){
        if(val==start) { System.out.println(start);return;}

        print(val, start+1);
        System.out.println(start);
    }

    static void sumOfNumbersParameterised(int value, int sum){
        if(value<1) {
            System.out.println(sum);
            return;
        }
        sumOfNumbersParameterised(value-1, sum+value);
    }

    static int sumOfNumbers(int value){
        if(value == 0){
            return 0;
        }
        return value + sumOfNumbers(value-1);
    }
    static int factorial(int value){
        if(value == 1){
            return 1;
        }
        return value * factorial(value-1);
    }

    static int[] reverseArray(int[] arr,int index){
        if(!(index<arr.length-index)) 
            return arr;

        int temp = arr[index];
        arr[index] = arr[arr.length-1-index];
        arr[arr.length-1-index] = temp;

        return reverseArray(arr, index+1);
    }

    static boolean isPalindrome(String text,int i){
        if( i <= text.length()/2 )
            if(text.charAt(i)!=text.charAt(text.length()-1-i)) return false;
            else return true;

        return isPalindrome(text, i+1);
    }

    public static void main(String[] args) {
        int n = 3;
        // print(5,1);
        sumOfNumbersParameterised(n, 0);
        System.out.println(sumOfNumbers(n));
        System.out.println("factorial "+factorial(n));

        int [] array = {1,2,3,4,5,6,7};

        int [] reversed = reverseArray(array, 0);

        for (int i = 0; i < reversed.length; i++) {
            System.out.print(" ");
            System.out.print(reversed[i]+" ");
        }
        System.out.println();

        System.out.println(isPalindrome("malayala", 0));



    }
    
}
