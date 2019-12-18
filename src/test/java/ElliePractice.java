import java.util.HashSet;
import java.util.Set;

public class ElliePractice {
    public static void main(String[] args){
        System.out.println(findPair(new int[] {2, 5, 8, 10, 7}, 9));
    }

    private static boolean findPair(int[] arr, int sum){

        Set<Integer> nums = new HashSet(arr.length);

        for (int num: arr){
            if(nums.contains(sum - num)){
                return true;
            }
            nums.add(num);
        }
        return false;
    }

}
