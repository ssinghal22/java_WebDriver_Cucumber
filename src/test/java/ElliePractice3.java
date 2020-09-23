import java.util.*;

import static java.lang.Math.sqrt;

public class ElliePractice3 {

    private static String reverseString1(String str){
        int len = str.length();

        for(int i = str.length()-1; i>=0; i--){
            str += str.charAt(i);
        }
        return(str.substring(len));
    }

   private static String reverseString(String str){
       String reverse = "";

       for(int i=str.length()-1; i>=0; i--){
           reverse += str.charAt(i);
       }
       return reverse;
   }

   private static String reverseString2(String str){
        char[] c = str.toCharArray();
        char temp;

        for(int i = 0; i<c.length/2; i++){
            temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }
        return String.valueOf(c);
   }

    private static void reverseArr(int[] arr){

        System.out.println(Arrays.toString(arr));

        if(arr == null || arr.length == 0){
            System.out.println("null or empty array");
            return;
        }
        int temp;
        for(int i=0; i<arr.length/2; i++){
          temp = arr[i];
          arr[i] = arr[arr.length-1 - i];
          arr[arr.length-1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static String reverseSent(String sent){
        String[] words = sent.split(" ");
        String reverse = "";
        for(int i = words.length -1; i>=0; i--){
            reverse += words[i] + " ";
        }
        return reverse.trim();
    }

    private static void top2Nums(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int temp;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max1){
                temp = max1;
                max1 = arr[i];
                max2 = temp;
            }
            else if(arr[i]>max2){
                max2 = arr[i];
            }
        }
        System.out.println("max1: " + max1 + " max2: " + max2);
    }

    private static boolean findPair(int[] arr, int sum){
        ArrayList<Integer> diff = new ArrayList<>();

        for(int i=0; i<arr.length; i++){

            if(diff.contains(arr[i])){
                return true;
            }
            int difference = sum - arr[i];
           diff.add(difference); //13, 9, 8, 5
        }
        return false;
    }

    private static void filterDups(int[] arr){
        Set<Integer> unique = new HashSet<>();
        for(int num: arr){
            unique.add(num);
        }
        for(int num: unique){
            System.out.println(num);
        }
    }

    private static void bubbleSort(int[] arr){
        int temp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //return arr;
    }

    private static boolean isNumPalindrome(int num){
        int original = num;
        int reverse = 0;
        while(num%10 >0){//2, 3, 2, 3, 2
            int digit = num%10; //2, 3, 2, 3, 2
            reverse = reverse*10 + digit; //2, 23, 232, 2323, 23232
            num = num/10; //2323, 232, 23, 2, 0
        }
        System.out.println("reverse: " + reverse);
        if(reverse == original){
            return true;
        }
        return false;
    }

    private static int nthNumFibonacci(int nth){
        int fib1 = 1;
        int fib2 = 1;
        int fibnth = 0;
        if(nth < 1){
            return 0;
        }
        if(nth == 1 || nth == 2){
            return 1;
        }
        if(nth > 2){
            System.out.print("1 1 ");
            for(int i=3; i<= nth; i++){
                fibnth = fib1 + fib2;
                System.out.print(fibnth+ " ");
                fib1 = fib2;
                fib2 = fibnth;
            }
            return fibnth;
        }
        return 0;
    }

    private static int recursionFib(int nth){
        if(nth<=2){
            return 1;
        }
        for(int i=1; i<=nth; i++){
            return recursionFib(nth-1) + recursionFib(nth-2);
        }
        return 0;
    }

    private static void countDups(int[] arr){
        Map<Integer, Integer> countNums = new HashMap<>();
        for(int num: arr){
            if(countNums.containsKey(num)){
                countNums.put(num, countNums.get(num) + 1);
            }
            else {
                countNums.put(num, 1);
            }
        }
        for(int num :countNums.keySet()){
            if(countNums.get(num) > 1){
                System.out.println("key: " + num + " count " + countNums.get(num));
            }
        }
        //System.out.println(countNums.entrySet());
    }

    private static boolean isNumPrime(int num){
        if(num <= 1){
            return false;
        }
        if(num <= 3){
            return true;
        }
        if(num%2 == 0 || num%3 == 0){
            return false;
        }

        System.out.println("sqrt(num) " + sqrt(num));
        for(int i = 5 ; i <= sqrt(num); i++){
            System.out.println("i " + i);
            if(num%i == 0){
                System.out.println("i is " + i);
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCode(String code){
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('[', ']');
        brackets.put('<', '>');
        brackets.put('(', ')');
        brackets.put('{', '}');

        char[] cArr = code.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c: cArr){
            if(brackets.containsKey(c)){
                stack.add(brackets.get(c));
            }
           else if(brackets.containsValue(c)){
                if(stack.empty()!= true && stack.peek()==c){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args){

        System.out.println(isValidCode("[a{b(c<aghtp>s)d}ef]"));

       // System.out.println(isNumPrime(53));

       // countDups(new int[] {3, 4, 5, 6, 3, 4});

       // System.out.println(5%5);

       // System.out.println(recursionFib(5));

      //  System.out.println(nthNumFibonacci(5));

       // System.out.println(isNumPalindrome(23232)); //23232

       /* int[] arr = {-4, -8, -89, -21, -9, 0};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));*/
        // System.out.println(Arrays.toString(bubbleSort(new int[] {-4, -8, -89, -21, -9, 0})));

        //filterDups(new int[] {20, 30, 9, -9, 20, -9});

        //System.out.println(findPair(new int[] {3, 7, 8, 11, 12}, 16));

       // top2Nums(new int[] {-13, -4, -67, -9, -8, 0});

        // reverseArr(new int[] {1, 2, 3, 4, 5});
        int[] nums = null;
       //reverseArr(nums);

       int[] nums1 = {};
     // reverseArr(nums1);

      //reverseArr(new int[] {});

       // reverseArr(new int[] {0});

        //System.out.println(reverseString("Soniya"));

        //System.out.println(reverseString1("Soniya"));

        //System.out.println(reverseString2("Soniya"));

       // System.out.println(reverseSent("I wanna be an SDET"));
    }
}
