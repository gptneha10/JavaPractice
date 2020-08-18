import java.util.HashMap;

//print 1st repeating character in array
public class FirstRepeatingCharacter {
    public static void main(String []args){

        int[]arr={1,2,3,4,4,3,2,1};

        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                System.out.println(arr[i]);
                break;
            }
            else
            {
                hm.put(arr[i],1);
            }
        }

    }
}
