public class StringPermutation {
    public static void main(String args[]) {
        permutation("123");
/*        System.out.println("aaa ="+"123".substring(0,0));
        System.out.println("123".substring(0,1));
        System.out.println("123".substring(0,2));
        System.out.println("123".substring(1,3)  );
        System.out.println("123".substring(2,3) );*/

    }


    public static void permutation(String input) {
        permutation("", input);
    }


    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println("aaaaaaa");
            System.err.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                System.out.println("bbbbbbbb");
                System.out.println("i: "+i);
                System.out.println("perm: "+ perm +" word.charAt(i): "+word.charAt(i)+" arg1: "+perm + word.charAt(i));
                System.out.println("word.substring(0, i) :"+ word.substring(0, i)+" word.substring(i + 1, word.length()): "+word.substring(i + 1, word.length()) +" arg2: "+word.substring(0, i) + word.substring(i + 1, word.length()));
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }

        }


    }
}
//perm=""+1,23
/*
perm =12 ,13
perm=123,12*/
