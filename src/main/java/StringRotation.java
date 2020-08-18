public class StringRotation {
    public static void main(String []s){
        String s1="xyz";
        String s2="zyx";
        String s3="";

        for(int i=s1.length()-1;i>=0;i--){
           s3=s3+s1.charAt(i);
        }

        System.out.println("s3="+s3);
        if(s2.equals(s3)){
            System.out.println(s1+ " rotation of "+s2);
        }
        else{
            System.out.println(s1+ " not rotation of "+s2);
        }
    }
}
