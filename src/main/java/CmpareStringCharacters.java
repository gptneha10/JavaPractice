import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

/*
if freq of all char is same , then yes
if freq of only 1 char is different, by 1 then yes . Ex : all char freq :2 , 1 char freq =3 , then yes else no
if freq of more than 1 char is diff , then no
 */
public class CmpareStringCharacters {
    public static void main(String []args){
        char []array={'z','a','a','b','m','l','b','y','c','c','d','d'};
        HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
        for(int i=0;i<array.length;i++){
            if(hm.containsKey(array[i])){
                //int value= hm.get(array[i]);
                hm.put(array[i],hm.get(array[i])+1) ;
            }
            else{
                hm.put(array[i],1) ;
            }
        }
        System.out.println(hm.values());
        Object[] valueArray=hm.values().toArray();

        int count=0;
       /* int first=0;
        int second=0;
        for(int j=0;j<valueArray.length;j++) {
            System.out.print("valueArray : " + (valueArray[j] + " "));
        }*/

        Arrays.sort(valueArray);
        int min= (Integer)valueArray[0];
        int max = (Integer)valueArray[valueArray.length-1];

        if(min==max)
            System.out.println("Yes");


        for(int j=0;j<valueArray.length;j++){
           // ("valueArray : "+(valueArray[j]+ " "));


            if((Integer)valueArray[j]!=min){
                count=count+1;
                //System.out.println(count);
                /*if(count==1){
                    first=(Integer)valueArray[j];
                    second=(Integer)valueArray[j+1];
                    System.out.println("first: "+first);
                    System.out.println("second: "+second);
                }*/

            }
        }
        System.out.println(count);
        if(count==1)
        {
            System.out.println("Yes");
        }
        if(count>1){
            System.out.println("No");

        }



    }
}
