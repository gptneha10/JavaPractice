//program to remove extra spaces to one space

public class RemoveExtraSpaces {
    public static void main(String []args){
        String s="hi   i am     Ne   ha      Gup  ta ";
        String s2="";

        for(int i=0;i<s.length()-1;i++){
          if(s.charAt(i)!=' '){
            s2=s2+s.charAt(i);

          }
          else if(s.charAt(i)==' '){
              if (s.charAt(i+1)!=' '){
                  s2=s2+s.charAt(i);
              }
          }

        }
        s2=s2+s.charAt(s.length()-1);

        System.out.print(s2);
    }
}
