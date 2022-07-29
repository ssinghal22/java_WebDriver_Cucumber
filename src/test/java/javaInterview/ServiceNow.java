package javaInterview;

import java.util.HashMap;
import java.util.Map;
/*Given an array of size n, find the majority element.
The majority element is the element that appears more
than ⌊ n/2 ⌋ times.

Assume that the array is non-empty and the majority
element always exist in the array.

Example 1:
Input: [3,2,3]
Output: 3


Example 2:
Input: [2,2,1,1,1,2,2]
Output: 2
-------*/
public class ServiceNow {
    public static void main(String[] args){

        int[] arr = {2,2,1,1,1,2,2};
        int length = arr.length;

        int majority = length/2;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < length; i++){
            if(map.keySet().contains(arr[i])){
                int temp = map.get(arr[i]);
                map.put(arr[i],++temp);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        for(Object key: map.keySet()) {
            Integer count = map.get(key);
            if (count > majority) {
                System.out.println(key);
            }
        }
    }
}

