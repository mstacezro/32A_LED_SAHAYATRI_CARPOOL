package view;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class emailValid {
   private static final String regex = "^(.+)@(.+)$";
   public static void main(String args[]) {
       List<String> emails = new ArrayList<String>();
       // valid email addresses
       emails.add("alice@example.com");
       emails.add("alice.bob@example.co.in");
       emails.add("alice#@example.me.org");
       //invalid email addresses
       emails.add("alice.example.com");
       emails.add("alice#example.com");
       emails.add("@example.me.org");
       //initialize the Pattern object
       Pattern pattern = Pattern.compile(regex);
       //searching for occurrences of regex
       for (String value : emails) {
           Matcher matcher = pattern.matcher(value);
           System.out.println("The Email address " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
       }
   }
}