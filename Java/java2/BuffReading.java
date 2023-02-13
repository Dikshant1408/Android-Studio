import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffReading
{
    public static void main(String[] args) throws IOException
    {
        int i ;
        BufferedReader bf = new BufferedReader(new FileReader("1.txt"));
        while ((i = bf.read())!= -1)
        {
            System.out.print((char)i);
        }
        bf.close();
    }
}
