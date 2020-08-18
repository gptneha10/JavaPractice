public class FindExtraElementInArray {

    public static void main(String []s)
    {
    int []a1={1,2,3,4,5,6};
    int []a2={1,2,3,4,6};



    for(int i=0;i<a1.length;i++){
        if(a1.length>a2.length && a1[i]!=a2[i]){
            System.out.println("Element found :" + a1[i]);
            break;
        }
        else if (a2.length>a1.length && a1[i]!=a2[i]){
            System.out.println("Element found :" + a2[i]);
            break;
        }
    }


    }
}
