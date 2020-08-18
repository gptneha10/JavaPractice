// arr 1 ={1,4} , arr2={2,3} output = arr1=(1,2) arr2={3,4}
//sort two arrays having non overlapping ranges each

package Array;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SortTwoArrays {
    public static void main(String []args) {
        int[] a1 = {1,4,5,8,9};
        int[] a2 = {2,3,6,7,10};

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {

                if (a1[i] > a2[j]) {
                    int temp = a1[i];
                    a1[i] = a2[j];
                    System.out.println("a1[i]: "+a1[i]);
                    System.out.println("temp: "+temp);
                    System.out.println("a2[j]: "+a2[j]);
                    for (int k = 0; k < a2.length-1; k++) {
                        if (temp > a2[k] && k!=0) {
                            a2[k - 1] = a2[k];
                            if(k==a2.length-1){
                                System.out.println("aaaaaA");
                                System.out.println("a2[j]: "+a2[j]);
                                a2[k] = temp;
                                System.out.println("a2[j]: "+a2[j]);
                            }
                            // j++;
                            System.out.println("k: "+ k);
                        } else if ( temp <= a2[k+1]) {
                            System.out.println("a2[j]: "+a2[j]);
                            a2[j] = temp;
                            System.out.println("a2[j]: "+a2[j]);
                        }
                    }
                    System.out.println("+++++++++++++");

                }

            }
            System.out.println("===================");
        }

        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
    }
}
