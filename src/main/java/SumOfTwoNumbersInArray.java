//display numbers in array whose sum is equal to the sum provided by the user.

public class SumOfTwoNumbersInArray {
    public static void main(String []args){
        int sum=4;
        int []arr={2,4,3,6,1,8};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i!=j && arr[i]+arr[j]==sum){
                    System.out.print("1st number: "+arr[i]+ " ");
                    System.out.println("2nd number: "+arr[j]);
                }
            }
        }
    }

}
