package String;

public class CountEvenLengthWords {
    public static void main(String []args) {
        String s = "hi i am neha1";

        String []word=s.split(" ");
        for(int i=0;i<word.length;i++){
            if(word[i].length()%2==0){
                System.out.println(word[i]);
            }
        }
    }

}
