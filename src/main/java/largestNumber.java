//find largest and 2nd largest number in array

public class largestNumber {
    public static void main(String[] args) {
        int[] array = {4, 3, 6, 8, 1};

        largest(array);
    }

    public static void largest(int[] array){
        int highest=0;
        int shig=0;

        for(int i=0;i<array.length;i++){
            if(highest<array[i]){
                shig=highest;
                highest=array[i];
            }
        }
        System.out.println("highest: "+ highest);
        System.out.println("2nd highest: "+ shig);

    }
}
