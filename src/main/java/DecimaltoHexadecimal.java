//convert a decimal to hexadecimal number
public class DecimaltoHexadecimal {
    public static void  main(String []args){
        int number=28;
        System.out.println("number= "+number);

        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        String str="";
        while(number>0){
            int rem=number%16;
            str=hex[rem]+str;
            number=number/16;
        }
        System.out.println("hexa= "+str);

       String hex2="1C";
       int n=0;
       for(int i=0;i<hex2.length();i++){
           char ch= hex2.charAt(i);
            n=hex2.indexOf(ch);
           n=16*n +n;


          //  n=n+ hex2.indexOf(hex[i+1]);
       }
        System.out.println(n);


    }
}
