public class QuotientReminder {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a + " ");
        System.out.println(b + " ");
        int sum = 0;

        int count = 2;
        while (count <= 5) {
            sum = a + b;
            a = b;
            b = sum;

            boolean isprime = true;
            for (int i = 1; i < sum / 2; i++) {
                if (sum / i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime == true) {
                System.out.println(sum + " ");
                count++;
            }
        }
    }
}

