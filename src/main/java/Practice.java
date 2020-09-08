import java.util.HashMap;
import java.util.HashSet;

//2,3,5,7,11
public class Practice {

    public static void main(String []args) {
        int []arr={2,5,1,6,2,8,5};
        int sum=7;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+", "+arr[j]);
                    System.out.println(arr[i]+", "+arr[j]);
                }
            }
        }


        }
}
