package javafsd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class check {		

    public static boolean isValid(String email)
    {
        String emailRegex =  "^(.+)@(.+)$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
  
    public static void main(String[] args)
    {
    	String Address[]={"venki@outlook.com","sam@myorganization.org","naveen#gmail.com","sundar@yahoo.org"};
       
          
            
        for(String i : Address){
            if (isValid(i))
                System.out.println(i + " - Yes");
            else
                System.out.println(i + " - No");
        }
    }


}