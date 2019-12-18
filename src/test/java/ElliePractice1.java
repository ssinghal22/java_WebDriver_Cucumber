import java.util.HashMap;
import java.util.Stack;

import static java.lang.Math.sqrt;

public class ElliePractice1 {

    public static void main(String[] args){
        //    System.out.println(findPair(new int[] {5, 10, 20, 30, 23}, 30));

        // System.out.println(isPrime(47));
       // System.out.println(sqrt(47));

        System.out.println(isValidCode("{[()]}678)"));
    }

    private static boolean isValidCode(String str){
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');
        char c;
        Stack stack = new Stack();

        for(int i = 0 ; i < str.length(); i++){
            c = str.charAt(i);

            if(brackets.containsKey(c)){
                stack.push(brackets.get(c));
            }
            else if(!stack.isEmpty() && brackets.containsValue(c) && stack.peek().equals(c)){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private static boolean findPair(int[] arr, int sum){
        return false;
    }

    private static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        if(num % 2 == 0){
            return false;
        }
        for(int i = 3; i <= sqrt(num); i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
