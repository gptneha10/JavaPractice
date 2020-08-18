public class SortAndFindMedian {
     public static void main(String []args){
         int []arr={5,3,8,1,9,2,6};

         int []sortedarr=sort(arr);

         for(int a=0;a<sortedarr.length;a++){
             System.out.print(sortedarr[a]+ " ");
         }

         findMedian(sortedarr);
     }
     public static int[] sort(int []array){
         for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                 if (array[j]>array[j+1]){
                     int temp=array[j];
                     array[j]=array[j+1];
                     array[j+1]=temp;
                 }
             }
         }
         return array;

     }

     public static void findMedian(int [] array){
         int len=array.length;
         int median=0;
         if((len%2)==0){
             int mid=len/2 ;
            median=(array[mid-1]+array[mid])/2;
             System.out.println("even :"+median);
         } else{
             median=array[len/2];
             System.out.println("odd :"+median);
         }
     }
}
