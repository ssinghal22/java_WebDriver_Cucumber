package javaInterview;

import java.util.Arrays;

public class WF4 {
    private static void updatePassword(String passwd){
        String regex = "[a-z]+[0-9]+[^a-zA-Z0-9]+";
        if (passwd.matches(regex)) {
            System.out.println("true");

            char[] cArr = passwd.toCharArray();
            int j = Integer.MAX_VALUE;
            for (int i = 0; i < cArr.length; i++) {
                System.out.println(cArr[i]);
                if (cArr[i] == '9'){
                    cArr[i] = '0';
                    j = i;
                }
                else if (j != i && (cArr[i] == '0' || cArr[i] == '1' || cArr[i] == '2'|| cArr[i] == '3' || cArr[i] == '4'
                        || cArr[i] == '5' || cArr[i] == '6' || cArr[i] == '7' || cArr[i] == '8')) {
                    cArr[i] = (char)((int)cArr[i] + 1);
                }
            }
            System.out.println(Arrays.toString(cArr));
            System.out.println(new String(cArr));
        }
    }


    public static void main(String[] args){
        String password = "soniy923!";

        updatePassword(password);

//        String password = "soniy92!";
//        //assume each numeric char must be incremented
//
//        char[] cArr = password.toCharArray();
//
//        ArrayList<Integer> list = new ArrayList();
//        list.add(0);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//
//        for(int i =0; i < cArr.length; i++){
//
//            if(list.contains(Character.getNumericValue(cArr[i]))){
//                System.out.println(cArr[i]);
//                    if(cArr[i] == '9'){
//                        cArr[i] = '0';
//                    }
//                else {
//                        int num = Character.getNumericValue(cArr[i]);
//                        num = num + 1;
//                        cArr[i] = (char) (num + '0');
//                    }
//                                }
//        }
//        System.out.println(cArr);
    }
}
