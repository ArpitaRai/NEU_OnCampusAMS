/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.oncampusams.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author arpitarai
 */
public class Validations {

    public static boolean isValid(String email) {
        String regex = "^(.+)@(.+)$";
        return email.matches(regex);
    }

    public static boolean isValidDate(String date) {
        String regex = "^(1[0-2]|0[1-9])/(3[01]"
                + "|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence) date);
        return matcher.matches();
    }

    public static boolean isTimeValid(String time) {
        String regex
                = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }
       public static boolean isContactValid(String time) {
        String regex
                = "(0/91)?[7-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }
     

}
