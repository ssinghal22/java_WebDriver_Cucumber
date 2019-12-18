import java.util.ArrayList;
import java.util.Arrays;

public class Walmart {

    public static void main(String args[]) {
        sortArr1(new int[]{0, 1, 1, 0, 1, 0, 1});
    }

    private static void sortArr(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arrList.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arrList.add(arr[i]);
            }
        }
        System.out.println(arrList);
    }

    private static void sortArr1(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == 0){
                ++count;
            }
        }
        for(int i = 0; i < count; i++){
            arr[i] = 0;
        }
        for(int i = count; i < arr.length; i++){
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
