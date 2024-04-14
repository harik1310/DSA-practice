public class Hashing{
    
     int[] hash = new int[26];

     void hashing(int value){
        hash[value] += 1;
        }

     void charHashing(char c){
        hash[c-'a'] += 1;
    }
public static void main(String[] args) {
    Hashing obj = new Hashing();
    Hashing charObj = new Hashing();

    String s = "aabsddccaa";
    for(int i=0;i<s.length();i++){
        charObj.charHashing(s.charAt(i));
    }
    System.out.println("char hashing");
    for(int i=0;i<charObj.hash.length;i++){
        System.out.println(i+" "+charObj.hash[i]);
    }

    int[] arr = {1,5,7,2,5};

    for(int i=0;i<arr.length;i++){
        obj.hashing(arr[i]);
    }
    System.out.println("integer hashing");
    for (int i = 0; i < obj.hash.length; i++) {
        System.out.println(i+" "+obj.hash[i]);   
    }





    }
}