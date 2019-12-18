import java.util.*;

public class ElliePractice2 {
    public static void main (String[] args){
        int i = 5;
        int j = 7;

        i = 5 + 7; //12
        j = i - j; //12 - 7 = 5
        i = i - j; //12 - 5 = 7
      //  System.out.println("i: " + i);
       // System.out.println("j: " + j);

       // reverseArr(new int[] {1, 3, 5, 6, 9});

        //reverseString("soniya");

       //System.out.println(swapWords("I love Krish very much!"));

      // System.out.println(isWordPalindrome("abcba"));
      // System.out.println(isSentencePalindrome("I love Krish!"));

       // find2TopNums(new int[] {40, 9, 10, 34, 0, 9});
       // find2TopNums(new int[] {-40, -9, -10, -34, 0, -9});

       // find2TopNums(new int[] {});

        //int[] arr = null;
       // find2TopNums(arr);

      // System.out.println(findPair(new int[] {45, 2, 89, 49}, 47));

       //System.out.println(Arrays.toString(filterDups(new int[] {4, 5, 8, 4, 8})));

        //bubbleSort(new int[] {5, 23, 56, 0, 8});

      //  System.out.println(isNumPalindrome(4554));

      // System.out.println(nthNumFib(5));

      //  System.out.println(recusrsionFib(5));

       // countDups(new int[] {1, 3, 5, 1, 2, 3, 5});

     //   System.out.println(isPrime(1));

        System.out.println(isValidCode("[{ ( }"));
    }

    private static boolean isValidCode(String str){
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('{', '}');
        brackets.put('(', ')');
        brackets.put('[', ']');

        for(int i = 0; i < str.length(); i++){
            if(brackets.containsKey(str.charAt(i))){
                stack.push(brackets.get(str.charAt(i)));
            }
            else if(brackets.containsValue(str.charAt(i))){
                if(!stack.isEmpty() && stack.peek() == str.charAt(i)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.empty();

    }

    private static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        if(num%2 == 0){
            return false;
        }
        if(num%3 == 0 || num%5 == 0){
            return false;
        }
        for(int i = 7; i <= Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    private static void countDups(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length; i++){
            if(map.keySet().contains(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key) > 1){
                System.out.println("key: " + key + " count: " + map.get(key));
            }
        }
    }

    private static int recusrsionFib(int nth){
        //1, 1, 2, 3, 5, 8
        if(nth <= 2){
            return 1;
        }
           return recusrsionFib(nth-1) + recusrsionFib(nth-2);
    }

private static int nthNumFib(int nth){
        int fib1 = 1;
        int fib2 = 1;
        int fibNext = 0;

        //1, 1, 2, 3, 5, 8
        if(nth <= 2){
            return 1;
        }

        for(int i = 3; i <= nth; i++){
            fibNext = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibNext;
        }
        return fibNext;
}

    private static boolean isNumPalindrome(int num){
        int original = num;
        int tens;
        int reverse = 0;
        while(num >= 1){
            tens = num %10;
            reverse = reverse *10 + tens;
            num = num/10;
        }
        if(reverse == original){
            return true;
        }
    else {
            return false;
        }
    }

    private static void bubbleSort(int[] arr){
    System.out.println(Arrays.toString(arr));
int temp;
    for(int i = 0; i < arr.length - 1; i++){
        for(int j = i+1; j < arr.length; j++){
            if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] filterDups(int[] arr){
        Set<Integer> set = new HashSet<>();

        for(int num: arr){
            set.add(num);
        }

        int[] result = new int[set.size()];

        int i = 0;
        for(Integer num: set){
            result[i++] = num;
        }
        return result;
    }

    private static boolean findPair(int[] arr, int sum){

        ArrayList<Integer> arrayList = new ArrayList<>();
        int diff = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < sum) {
                if(arrayList.contains(arr[i])){
                    return true;
                }
                diff = sum - arr[i];
                arrayList.add(diff);
            }
        }
        return false;

    }

    private static void find2TopNums(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        if(arr == null || arr.length < 3){
            System.out.println("null or too small array");
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max1){
                max1 = arr[i];
            } else if(i != 0 && arr[i] > max2){
                max2 = arr[i];
            }
        }
        System.out.println("max1: " + max1);
        System.out.println("max2: " + max2);
    }

    private static void reverseArr(int[] arr){
        int temp;

        for(int i = 0; i < arr.length/2; i++){
            temp = arr[i];
          arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
}

private static void reverseString(String str){

        char temp, first, last;
        for(int i = 0; i < str.length()/2; i++){
        }

    }

    private static String swapWords(String str){
        String[] words = str.split(" ");
        String sentence = " ";

        for(int i = words.length -1; i >= 0; i--){
            sentence += words[i] + " ";
        }
       // System.out.println(sentence.trim());
        return sentence.trim();
    }

   private static boolean isWordPalindrome(String str){

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length/2; i++){
            if(arr[i] != arr[arr.length -1 - i]){
                return false;
            }
        }
        return true;
   }

   private static boolean isSentencePalindrome(String sent){
        String[] words = sent.split(" ");
        return true;
   }



}
