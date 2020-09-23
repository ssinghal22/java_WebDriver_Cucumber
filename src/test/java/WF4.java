import java.util.ArrayList;

public class WF4 {
    public static void main(String[] args){

        String password = "soniy92!";
        //assume each numeric char must be incremented

        char[] cArr = password.toCharArray();

        ArrayList<Integer> list = new ArrayList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        for(int i =0; i < cArr.length; i++){

            if(list.contains(Character.getNumericValue(cArr[i]))){
                System.out.println(cArr[i]);
                    if(cArr[i] == '9'){
                        cArr[i] = '0';
                    }
                else {
                        int num = Character.getNumericValue(cArr[i]);
                        num = num + 1;
                        cArr[i] = (char) (num + '0');
                    }
                                }
        }
        System.out.println(cArr);
    }
}
