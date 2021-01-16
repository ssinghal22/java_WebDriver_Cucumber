import java.util.*;

public class EllieClass {

   static private void swapReverse(int[] arr){
       int temp;
       for (int i = 0; i < arr.length/2; i++){
           temp = arr[i];
           arr[i] = arr[(arr.length - 1) - i];
           arr[(arr.length - 1) - i] = temp;
       }
    }

    /*private static String reverseString(String str){

       int len = str.length();

       for (int i = str.length() -1; i >= 0; i--){
           str += str.charAt(i);
       }
       return str.substring(len);
    }*/

private static String reverseString(String str){
    char temp;

    char[] arr = str.toCharArray();

    for (int i = 0; i < arr.length/2; i++){
        temp = arr[i];
        arr[i] = arr[(arr.length - 1) - i];
        arr[(arr.length - 1) - i] = temp;
    }

   // return new String(arr);
    return String.valueOf(arr);
}

private static String reverseSent(String str){

    String[] words = str.split(" ");
    String revSent = "";

//    for (int i = words.length - 1; i >= 0; i-- ){
//        revSent += words[i] + " ";
//    }
//    return revSent;

    for (String word: words){
        revSent = word + " " + revSent; // i love krish - krish love i
    }
    return revSent.trim();
}

 private static void top2Nums(int[] arr){
    //no sorting, only loop thru once
     int max1 = Integer.MIN_VALUE;
     int max2 = Integer.MIN_VALUE;
     int temp = Integer.MIN_VALUE;

     if(arr == null || arr.length < 2) {
         System.out.println("arr is null or size less than 2");
         return;
     }

     for (int i = 0; i < arr.length; i++){
         if (arr[i] > max1){
             temp = max1;
             max1 = arr[i];
             max2 = temp;
         }
         else if(arr[i] < max1){
             if(arr[i] > max2){
                 max2 = arr[i];
             }
         }
     }
     System.out.println("Top 1 num is: " + max1);
     System.out.println("Top 2 num is: " + max2);
 }

 private static Boolean findPair(int[] arr, int sum){
     //int[] numsSum = {2, 5, 1, 3, 3, 8};

     // not efficient way
//    for (int i = 0; i < arr.length; i++){
//        for (int j = i+1; j < arr.length; j++){
//            if (arr[i] + arr[j] == sum){
//                return true;
//            }
//        }
//    }
//    return false;

//efficient way when large data set, using 1 loop
     if (arr.length < 2){
         return false;
     }

     Set nums = new HashSet<>();

     for (int num: arr){
         int diff = sum - num;

         if (nums.contains(diff)){
             return true;
         }
             nums.add(num);
     }
     return false;
 }

 private static String reverseString1(String word){
    char temp;
    char[] c = word.toCharArray();

    for(int i = 0; i < c.length/2; i++){
        temp = c[i];
        c[i] = c[c.length -1 - i];
        c[c.length -1 - i] = temp;
    }
    return new String(c);
 }

    public static void main(String args[]) {

   // System.out.println(reverseString1("soniya"));

        char a = 'j';
        char b = 'h';
        // System.out.println("a: " + a + " b: " + b);

        char temp;
        temp = a;
        a = b;
        b = temp;
        // System.out.println("a: " + a + " b: " + b);

        // int[] arr = {2, 4, 6, 7, 8, 0};
        // System.out.println(arr);

        //System.out.println(arr.toString());

        // System.out.println(Arrays.toString(arr)); // use Arrays package

        // swapReverse(arr);

        //  System.out.println(Arrays.toString(arr));

        String name = "Soniya";

        //System.out.println(reverseString(name));

        String sent = "I wanna be an SDET";
        // System.out.println(reverseSent(sent));

        int[] nums = {5, 18, 67, 29, 34};

        //int[] nums = null;

        //int[] nums = new int[0];

        // int[] nums = {-5, -90, -35, 100};

        // top2Nums(nums);

        //int[] numsSum = {2, 5, 1, 3, 3, 8};
        // System.out.println(findPair(numsSum, 100));

        // System.out.println(filterDups(int[] lst)); //lst is array of ints

//        for (int i = 0 ; i < 10; i++){
//            System.out.println(i);
//        }
        int[] arr = {4, 67, 3, 89, 0, 23};
        //System.out.println(Arrays.toString(arr));
        //bubbleSort(arr);
        //System.out.println(Arrays.toString(arr));

        //System.out.println(isNumPalindrome(8765));

        //test cases - positive - 1221, negative - 987, boundary + 0, MAX_Integer, boundary -ve Min_Integer
        //only same digit


        // System.out.println(Integer.MAX_VALUE);

        //fibonacci series 1 1 2 3 5 8 13 21 - find 5th num in sequence

        // System.out.println(nthNumFibonacci(8));

        //System.out.println(nthNumFibRec(4));
    }

    private static long nthNumFibRec(int n){
        if (n < 1){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }

        return nthNumFibRec(n-1) + nthNumFibRec(n-2);
     }

    private static long nthNumFibonacci(long n){
    if (n < 1){
        return 0;
    }
    if (n == 1 || n == 2){
        return 1;
    }
    int fib1 = 1;
    int fib2 = 1;
    int nthFib = 1;

    for (int i = 3 ; i <= n; i++){ //can't use for each loop here
        nthFib = fib1 + fib2;
        fib1 = fib2;
        fib2 = nthFib;
    }
    return nthFib;
    }

    private static Boolean isNumPalindrome(int original_num){
    int num = original_num;
    int reverse = 0;
    int ones;

    if (original_num > 2147447412 || original_num < 0) { //palindrome from Integer.MAX_VALUE, checks amount of num
        return false;
    }

    while(num > 0){ //for negatives, ask if ok, take absolute value
        ones = num % 10;
        num = num/10;
        reverse = reverse * 10 + ones;
    }
    if ( original_num == reverse) {
        return true;
    }
    return false;
    }

    private static int[] filterDups(int[] lst) {
        Set set = new HashSet<>(Arrays.asList(lst)); //filters out dups as soon as we pass in

        int[] result = new int[set.size()];
        int i = 0;
        for (Object obj: set){
            result[i++] = (int)obj;
        }
        return result;
    }

    private static void bubbleSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
