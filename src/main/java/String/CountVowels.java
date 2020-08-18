package String;

public class CountVowels {
    public static void main(String []args){
        String s="neAha a d i l E";
        s=s.toUpperCase();
        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ){
                count++;
            }
        }
        System.out.println(count);
    }
}
