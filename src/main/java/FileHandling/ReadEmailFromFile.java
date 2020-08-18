//Java program to read all Emails present in a Given file
package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadEmailFromFile{

    public static void main(String []args) {
        try {
            FileReader fr = new FileReader("src/main/resources/Employee.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                Pattern p= Pattern.compile("[a-zA-Z0-9]"
                        +"[a-zA-Z0-9_.]"
                        +"+@[a-zA-Z0-9]"
                        +"+([.][a-zA-Z]+)");
                Matcher m=p.matcher(line);
                while(m.find()) {
                    System.out.println(m.group());
                }

            }
        }
        catch(FileNotFoundException e){
          e.printStackTrace();
        }

        catch(IOException e){
            e.getStackTrace();
        }
    }


}
