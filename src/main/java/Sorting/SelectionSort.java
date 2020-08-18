package Sorting;

public class SelectionSort {
    public static void main(String []args){

        int []arr={9,8,7,6,5,4,3,2,1};
        int counter=0;
        int swap=0;
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    counter=j;
                }
            }
            if(arr[i]>min){

                int temp=arr[i];
                arr[i]=arr[counter];
                arr[counter]=temp;
                swap=swap+1;

            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println(swap);
    }
}
