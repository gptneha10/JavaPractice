//How to remove characters from the first String which are present in the second String?

public class DeleteCharacters {

    public static void main(String []args){
        String s1="india is great";
        String s2="in";
        //output=da s great
        removeDuplicates(s1,s2);
    }

   public static void removeDuplicates(String s1,String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        String s3="";

       for(int i=0;i<c1.length;i++) {
           int count=0;
           //System.out.println(c2[j]));
           for (int j = 0; j < c2.length; j++) {
                if(c1[i]== c2[j]){
                    count=1;
                   break;
                }
           }
           if(count==0){
           }      s3=s3+c1[i];

       }

       System.out.println(s3);
       //for(int k=0;k<c1.length;k++){
         //  System.out.print(c1[k]);
       //}
   }
}
