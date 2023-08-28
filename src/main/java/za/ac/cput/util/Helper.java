/**
 * This is a basecode
 * Helper.java
 * @author: Tsireledzo Wisdom Makhado (221116273)
 * Date: 06 June 2023
 */
package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.List;
import java.util.UUID;

public class Helper {

    public static Boolean isNullorEmpty(String s){
        if(s==null||s.isBlank()){
            return true;
        }
        return false;
    }

    public static Boolean isNullorEmpty2(List s){
        if(s==null||s.isEmpty()){
            return true;
        }
        return false;
    }
    public static Boolean isNullorEmpty3(Float s){
        if(s==null||s.isNaN()){
            return true;
        }
        return false;
    }
    //auto generate id
    public static String generateId(){
        return UUID.randomUUID().toString();
    }

    public static String generateNumber(){
        float min = 100000000000L;
        long max = 260000000000L;
        long studentNumber = (long)(Math.random()*(max-min+1)+min);
        return String.valueOf(studentNumber);
    }

    //validate the email
    public static Boolean isValidEmail(String email){
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);

    }
}