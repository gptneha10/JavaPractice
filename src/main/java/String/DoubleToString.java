package String;

public class DoubleToString {

    public static void main(String []args){

        Double d=3.14;

        String s= "" + d;
        System.out.println(s);

        String s1="123.1";
            Double d1=Double.parseDouble(s1);
        System.out.println(d1);

    }
}
