public class QuickSortPractical {
    public static void main(String []s){

    int []a={0,4,3,7,22,2,8,1,5,2};

       quicksort(a,0,a.length-1);

       for(int i=0;i<a.length;i++){
           System.out.print(a[i] + " ");
       }
    }

    public static void quicksort(int []a,int left,int right){

        int pivot=right;
       // System.out.println("pivot :"+ a[pivot]);



        if((right-left) >0) {

            System.out.println("left "+ left);
            System.out.println("right "+ right);
            int i=left -1;
            for(int j=left;j<right;j++) {
                if (a[j] <= a[pivot]) {
                    i++;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                    System.out.println("left3 :" + left);
                    System.out.println("right3 :" + right);
                }


            }
            int temp = a[i+1];
            a[i+1] = a[pivot];
            a[pivot] = temp;
            //pivot = left;

            //int right1=pivot-1;


            for (int i1 = 0; i1 < a.length; i1++) {
                System.out.print(a[i1] + " ");
            }

            System.out.println("hiiiii");


            quicksort(a, left, i);
            quicksort(a, i+2, a.length - 1);
        }



    }
}
