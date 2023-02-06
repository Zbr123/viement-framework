package step_defination.web;

import org.apache.commons.lang3.RandomStringUtils;
import pages.Page;

import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class CommonFunctions extends Page {

    public int randomEmialSuffix() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return randomInt;
    }

    public String random5NumberSuffix(String previousNumbers) {
        String randomNumber = RandomStringUtils.randomNumeric(5);
        String mobileNumber = previousNumbers+randomNumber;
        return mobileNumber;
    }

    public String random2NumberSuffix(){
        String randomNumber = RandomStringUtils.randomNumeric(2);
        return randomNumber;
    }
    public String todaysDateInMMDDYYYY(){
        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = dateObj.format(formatter);
        System.out.println(date);
        return date;
    }

    public String currentTimeInHHMM(){
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("HH:mm");
        System.out.println(format.format(date));
        return format.format(date);
    }
//    public String currentTimeInSeconds(){
//        String dateFormat = currentTimeInHHMMSS();
//        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//    }

    public String currentTimeInHHMMBut10minutesAhead(){
        int oldTime = Integer.parseInt(currentTimeInHHMM());
        int modTime = oldTime + 10;
        System.out.println(modTime);
        return String.valueOf(modTime);
    }

}