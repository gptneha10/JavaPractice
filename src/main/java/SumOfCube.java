import java.util.Scanner;

//print sum of cube of n natural numbers
public class SumOfCube {

    public static void main(String []args){
        System.out.println("Enter number: ");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();

        for(int i=0;i<=num;i++){
            System.out.println("Sum of cube of "+i+": "+i*i*i);

        }
    }
}
