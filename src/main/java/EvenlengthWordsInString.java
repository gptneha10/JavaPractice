//Java program to print Even length words in a String
//input ="i am Neha" ; o/p=am
public class EvenlengthWordsInString {

    public static void main(String []args){
        String s="ii am Neha1";

        String []sa=s.split(" ");
        for(int i=0;i<sa.length;i++){
            String word=sa[i];
            if((word.length()%2)==0){
                System.out.println(word);
            }
        }
    }
}
