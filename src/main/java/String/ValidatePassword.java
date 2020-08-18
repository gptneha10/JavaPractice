//Java Program to check the validity of a Password using User Defined Exception
// to continue loop post exception occur in an iteration , use continue in catch block

package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {

    public static void main(String[] args) {
        String[] passArray = {"heyNeha", "Jaishriram@1024"};


        for (int i = 0; i < passArray.length; i++) {
            try {
                boolean validLength = validateLength(passArray[i]);

                if (validLength) {

                    if (passArray[i].contains(" ")) {
                        throw new InvalidPasswordException("Invalid password: Space is present");
                    }

                    Pattern p = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,20})");
                    Matcher m = p.matcher(passArray[i]);
                    System.out.println("match: " + m.matches());

                    if (m.matches()) {
                        System.out.println(passArray[i]);
                    } else {
                        throw new InvalidPasswordException("Invalid password: pattern not matching");
                    }


                }

            } catch (InvalidPasswordException e) {
                e.printStackTrace();
                continue;
            }

        }
    }

        public static boolean validateLength (String s){
            if (s.length() < 8 || s.length() > 15) {
                throw new InvalidPasswordException("Invalid password: Length is not between 8-15.");
            }
            return true;
        }
    }


class InvalidPasswordException extends RuntimeException{
 public InvalidPasswordException(String msg) {
     super(msg);

 }
}
