import java.util.Arrays;

public class Personalis {
    public static void main(String[] args) {
        int[] arr = {10, 1, 0, 12, 2, 3, 0, 13};
        //output = {10, 1, 12, 2, 3, 13, 0, 0}

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] != 0) {
               arr[count] = arr[i];
               ++count;
           }
        }
        while (count < arr.length) {
            arr[count] = 0;
            ++count;
        }
        System.out.println(Arrays.toString(arr));
    }
}
