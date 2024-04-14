public class Patterns {

   static void print1(){
        for (int i = 0; i < 4 ;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }

    static void print2(){
        for (int i = 0; i < 4 ;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }

    static void print3(){
        for (int i = 0; i < 4 ;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
            
        }
    }
    
    static void print4(){
        for (int i = 0; i < 4 ;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");   
        }
        System.out.println();
    }
    static void print5(){
        for (int i = 4; i > 0 ;i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }

    static void print6(){
        for(int i=0;i<3;i++){
            for(int j=3;j>i+1;j--){
                System.out.print("-");
            }

            for(int j=0;j<i+i+1;j++){
                System.out.print("*");
            }
            
            for(int j=3;j>i+1;j--){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    
    static void print7(){
        for(int i=3;i>0;i--){
            for(int j=3-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i+i-1;j++){
                System.out.print("*");
            }   
        System.out.println();
        }
    }

    static void print8(){
        for(int i=0;i<3;i++){
            for(int j=2-i;j>0;j--){
                System.out.print("-");
            }
            for(int j=i+i+1;j>0;j--){
                System.out.print("*");
            }
            for(int j=2-i;j>0;j--){
                System.out.print("-");
            }
            System.out.println();
        }
        for(int i=2;i>0;i--){
            for(int j=2-i;j>=0;j--){
                System.out.print("-");
            }
            for(int j=i+i-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }








    public static void main(String args[]){
        print1();
        System.out.println();
        System.out.println("pattern 1");
        print2();
        System.out.println();
        System.out.println("pattern 2");
        print3();
        System.out.println();
        System.out.println("pattern 4");
        print4();
        System.out.println();
        System.out.println("pattern 5");
        print5();
        System.out.println();
        System.out.println("pattern 6");
        print6();
        System.out.println();
        System.out.println("pattern 7");
        print7();
        System.out.println();
        System.out.println("pattern 8");
        print8();
        System.out.println();
    }
}