public class WF311 {

    public static void main(String[] args){
        String emailList = "ssinghal22@yahoo.com,ssinghalkrishna@gmail.com,ssinghalkrish@gmail.com";
        String[] emails = emailList.split(",");

        for(String email: emails){
            System.out.println(email);
            String[] names = email.split("@");
            System.out.println(names[0]);
            if (names[0].matches("[a-zA-Z]+")) {
                    System.out.println(names[0]);
                }
        }
    }
}
