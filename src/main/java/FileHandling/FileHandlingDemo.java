package FileHandling;

import java.io.*;

public class FileHandlingDemo {

    public static void main(String []args){

       String  fileLocation ="src/main/resources/Employee.txt";
        readFileUsingReader(fileLocation);
        System.out.println("");
        readFileUsingReaderBuffer(fileLocation);
        System.out.println("");
        readFileUsingReaderStream(fileLocation);

        String data="Hi Neha here.I work for UHG";
        writeFileUsingWriter(data);
        writeFileUsingBufferedWriter(data);
        writeFileUsingStreamWriter(data);
    }

    public static void readFileUsingReader(String fileLocation){
        File file=new File(fileLocation);
        try {
            FileReader fr = new FileReader(file);
            int i;
            while((i=fr.read())!=-1) {
                System.out.print((char) i);
            }
            fr.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void writeFileUsingWriter(String data){
        File file=new File("src/main/resources/Employee1.txt");
        try{
            FileWriter fw=new FileWriter(file);
            for(char c: data.toCharArray()){
                fw.write(c);
            }
            fw.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void readFileUsingReaderBuffer(String fileLocation){
        File file=new File(fileLocation);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader frb=new BufferedReader(fr);
            String line;
            while((line=frb.readLine())!=null) {
                System.out.print(line);
            }
            frb.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void writeFileUsingBufferedWriter(String data){
        File file=new File("src/main/resources/Employee2.txt");
        try{
            FileWriter fw=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(data,0,10);
            bw.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void readFileUsingReaderStream(String fileLocation){
        File file=new File(fileLocation);
        try {
            FileInputStream is=new FileInputStream(file);
            BufferedInputStream bis=new BufferedInputStream(is);
            int c;
            while(((c=bis.read())!=-1) ){
                System.out.print((char)c);
            }
            // illustrating available method
            System.out.println("Number of remaining bytes:" +
                    bis.available());

            bis.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void writeFileUsingStreamWriter(String data){
        File file=new File("src/main/resources/Employee3.txt");
        try{
            FileOutputStream fo=new FileOutputStream(file);
            BufferedOutputStream bos=new BufferedOutputStream(fo);
            for(char c:data.toCharArray()){
                bos.write(c);
            }
            bos.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
