public class PrimeNumber {
    public static void main(String []args){
       // int n=5;
        int count=1;
        int num=2;
        while(count<=5){
        boolean isPrime=true;

        for(int i=2;i<=num/2;++i){

            if(num%i==0){
                isPrime=false;

                break;
            }
            else{
                isPrime=true;

            }

        }

        if(isPrime==true){
            System.out.println(num);
            count=count+1;
        }
        num++;
        }
    }
}
