public class MoveUppercaseToEnd {

    public static void main(String []args){
        String s="Hello India";
        String s1= new String("Hello India");

        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s.compareTo(s1));
        System.out.println(s.compareToIgnoreCase(s1));

        moveUppercase(s);

    }

   public static void moveUppercase(String s) {
        String lower="";
        String upper="";
       for (int i = 0; i < s.length(); i++) {


           if ((s.charAt(i)>='A') && (s.charAt(i)<='Z')){
               upper= upper + (s.charAt(i));
           }
           else{
               lower=lower + s.charAt(i);
           }
       }

       s=lower+upper;
       System.out.println(s);
   }
}
