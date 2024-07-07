package fisiere;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fisier
{
    public static void main(String[] args)
    {
        File writeTo = new File("txt");
        try
        {
            writeTo.createNewFile();
            FileWriter writeSomething = new FileWriter("writeTo.txt");
            writeSomething.write ("Ana are mere");
            writeSomething.close();
        }
        catch (IOException e)
        {
          throw new RuntimeException(e);
        }
        File readFrom=new File ("readFrom.txt");
       // Scanner scan=new Scanner("readFrom);

        try
        {
            Scanner scan1 = new Scanner(readFrom);
            while (scan1.hasNextLine())
                System.out.println(scan1.nextLine());
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }


    }
}
