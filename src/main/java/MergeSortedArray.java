/*
//given two sorted arrays, combine these two arrays into one in sorted order.

public class MergeSortedArray {
    public static void main(String[] args){
 */
/*       int []a1={3,4,6,8};
        int[] a2={1,2,3,5,7};*//*

        int []a1={1,2};
        int[] a2={6,8,9,12,16};
        int []a3=new int[a1.length+a2.length];
        int count=0;
        int counter=0;


       for(int i=0;i<a1.length;i++){
           for(int j=counter;j<a2.length;j++){
               if(a1[i]<a2[j]){
                   a3[count]=a1[i];
                   System.out.println("------------");

                   System.out.println( "counter1: "+count + " :"+a3[count]);
                   System.out.println("count: "+count);
                   count++;
                   break;
               }

               else if(a1[i]>a2[j]){
                   a3[count]=a2[j];
                   System.out.println("------------");
                   System.out.println( "counter2: "+count + " :"+a3[count]);
                   System.out.println("counter: "+counter);
                   count++;
                   counter++;
               }
               else if(a1[i]==a2[j]){
                   a3[count]=a1[i];
                   System.out.println("------------");
                   System.out.println( "counter3: "+count + " :"+a3[count]);
                   System.out.println("counter: "+counter);
                   count++;
                   break;
               }


           }
           if(counter>=a2.length){
               a3[count]=a1[i];
               System.out.println("------------");
               System.out.println( "counter4: "+count + " :"+a3[count]);
               count++;
           }

           else if(i==a1.length-1 && counter<a2.length-1) {
               a3[count]=a2[counter];
               System.out.println("------------");
               System.out.println( "counter5: "+count + " :"+a3[count]);
               System.out.println("count: "+count);
               System.out.println("counter: "+counter);

               count++;
               counter++;

           }

        }


       for(int k=0;k<a3.length;k++){
           System.out.print(a3[k]+ " ");
       }



    }
}
*/

public class MergeSortedArray {
    public static void main(String[] args){

/*       int []a1={3,4,6,8};
        int[] a2={1,2,3,5,7};*/

        int []a1={11};
        int[] a2={1,2,4,5,7,9,11,11};
        int []a3=new int[a1.length+a2.length];
        int count=0;
        int counter=0;
        int i=0;
        int j=0;

      while(i<a1.length && j<a2.length){
          if(a1[i]<a2[j]){
              a3[count]=a1[i];
              System.out.println("------------");
              System.out.println( "counter1: "+count + " :"+a3[count]);
              System.out.println("count: "+count);
              count++;
              i++;

          }

          else if(a1[i]>a2[j]){
              a3[count]=a2[j];
              System.out.println("------------");
              System.out.println( "counter2: "+count + " :"+a3[count]);
              System.out.println("counter: "+counter);
              count++;
              j++;
          }
          else if(a1[i]==a2[j]){
              a3[count]=a1[i];
              System.out.println("------------");
              System.out.println( "counter3: "+count + " :"+a3[count]);
              System.out.println("counter: "+counter);
              count++;
              i++;
          }
      }

      while(i<a1.length){
          a3[count]=a1[i];
          count++;
          i++;
      }

      while(j<a2.length){
            a3[count]=a2[j];
            count++;
            j++;
      }



        for(int k=0;k<a3.length;k++){
           System.out.print(a3[k]+ " ");
       }



    }
}

