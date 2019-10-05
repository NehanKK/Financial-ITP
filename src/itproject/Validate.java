/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itproject;

import java.util.regex.Matcher;

/**
 *
 * @author Nehan KK
 */
public class Validate {
       public static boolean validateEmail(String email) {                 

                        
       boolean status=false;    
       String EMAIL_PATTERN = 
  "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
  + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
       Pattern pattern = Pattern.compile(EMAIL_PATTERN);
       Matcher matcher=pattern.matcher(email);
       if(matcher.matches())
       {
           status=true;
       }
       else{
           status=false;
       }
           return status;
            
    }

    static boolean validatemail(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
