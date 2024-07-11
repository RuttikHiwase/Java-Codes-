import java.io.*;
class FileHandling {
    public static void main(String[] args) throws Exception{

        System.out.println("This is File Handling Work");

        // Created the Obj of File class present in java.io package
        //exists()- checks that abc.txt file is already present or not and return the boolean value
        File file=new File("abc.txt");
        System.out.println(file.exists());


        // To Create a New File with previous object of File
             file.createNewFile();
             System.out.println(file.exists());


        // To Write Inside the File using FileWriter
        FileWriter fw=new FileWriter(file);// File obj is passed in it or we can write (new File("abc.txt");
        fw.write("hello to abc file ");
        fw.close();// compulsory to close    


        //To Read The File abc.txt with FileReader 
        FileReader fr=new FileReader(file);
        System.out.println(fr.read());// o/p i s 104 ---for correct o/p we use bufferReader
        fr.close();


        // Here Creating New obj of File class for Creating new xyz.txt file
         File file2=new File("xyz.txt");
         file2.createNewFile();
          System.out.println("file2 is exits :  "+ file2.exists());

         //Write Using BufferedWrite on xyz.txt
         FileWriter fw2=new FileWriter("xyz.txt");
           BufferedWriter bw=new BufferedWriter(fw2);
           bw.write("Hello ! Welcome to xyz.txt");
           bw.close();



        //Read Using BufferedReader on xyz.txt
        FileReader fr2=new FileReader("xyz.txt");
           BufferedReader br=new BufferedReader(fr2);
           br.readLine();
           System.out.println(br.readLine());
           br.close();



       



    }
}