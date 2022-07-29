package javaInterview;

import java.util.HashMap;

public class IntelliSwift {
    public static void main(String[] args){

        String[] str = {"aaa", "bbb", "ccc", "aac"};
       System.out.println(readAFile(str));
    }

private static boolean readAFile(String[] str){

    HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length; i++){
            if(map.containsKey(str[i])){
                map.put(str[i], map.get(str[i]) + 1);
            }
            else {
                map.put(str[i], 1);
            }
        }

        for(String key: map.keySet()){
            if(map.get(key) > 1){
                return false;
            }
        }
return true;
}
}
