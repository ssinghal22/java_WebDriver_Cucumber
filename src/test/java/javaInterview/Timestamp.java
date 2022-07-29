package javaInterview;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Timestamp {

    public static void main(String args[]){
        Calendar cal = Calendar.getInstance();

        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        String dayOfMonthStr = String.valueOf(dayOfMonth);

        int month = cal.get(Calendar.MONTH) + 1;

        String monthStr = String.valueOf(month);

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

        String email = "Great" + monthStr + dayOfMonthStr + timeStamp + "@credible.com";

        System.out.println("email id is: " + email);
    }
}
