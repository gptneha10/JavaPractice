package String;

import java.io.*;

public class abc {
    public static void main(String[] args) throws IOException {
        File f = new File("src/main/resources/abc.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            String[] ia = line.split(",");
            int sum = 0;
            for (int i = 0; i < ia.length; i++) {
                sum = sum + Integer.parseInt(ia[i]);

            }
            System.out.println(sum);


        }
    }
}

  /*   String s="3,4,5";
    String[] ia= s.split(","); // 1 2
        int sum=0;
    for(int i=0;i<ia.length;i++){
        sum= sum+ Integer.parseInt(ia[i]);
        }
        System.out.println(sum);

    }
}*/
