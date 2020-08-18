/*sort words in a string
input =my name is neha
        o/p= is my name neha
        if 1st alphabet of two woreds are same , then compare next alphabet*/
package General;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortWordsInString {

    public static void main(String[] args) {
    String s="my name is neha";
        ArrayList<String> list = new ArrayList<>();

    String[] word=s.split(" ");
    for(int i=0;i<word.length-1;i++){
        for(int j=i+1;j<word.length;j++) {
            list.clear();
            System.out.println("before sort element1: "+word[i]);
            System.out.println("before sort element2: "+word[j]);
            list.addAll(sort(word[i], word[j]));
            System.out.println("after sort element1: "+list.get(0));
            System.out.println("after sort element2: "+list.get(1));
            if (word[i] != list.get(0)) {
                String temp = word[i];
                word[i] = list.get(0);
                word[j] = temp;
            }
            for(int k=0;k<word.length;k++){
                System.out.print(word[k]+ " ");
            }
            System.out.println("=======");
        }
        System.out.println("+++++++++");

    }
    for(int k=0;k<word.length;k++){
        System.out.print(word[k]+ " ");
    }

    }

    public static List<String> sort(String word1,String word2){
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        List<String> list=new ArrayList<>();

        int l1=ch1.length;
        int l2=ch2.length;
        boolean isL1Less=false;
        if(l1<l2){
            isL1Less=true;
        }
        if(isL1Less){
            for(int i=0;i<l1;i++){
                if(ch1[i]<ch2[i]){
                    list.add(word1);
                    list.add(word2);
                }
                else if(ch1[i]>ch2[i]){
                    list.add(word2);
                    list.add(word1);
                }
            }
        }
        else{
            for(int i=0;i<l2;i++){
                if(ch1[i]<ch2[i]){
                    list.add(word1);
                    list.add(word2);
                }
                else if(ch1[i]>ch2[i]){
                    list.add(word2);
                    list.add(word1);
                }
            }

        }
        return list;
    }
}