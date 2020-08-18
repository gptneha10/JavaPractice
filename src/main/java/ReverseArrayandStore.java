// reverse a array and store it in same array

public class ReverseArrayandStore {
    public static void main(String []args){
        String s="Neha";

        char[] ch=s.toCharArray();
        int j=ch.length-1;

        for(int i=0;i<ch.length/2;i++,j--){
            char temp;
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
        }

        for(int k=0;k<ch.length;k++){
            System.out.print(ch[k]);
        }

        //Nitin


    }
}
