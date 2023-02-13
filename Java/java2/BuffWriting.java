import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BuffWriting
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bf = new BufferedWriter(new FileWriter("1.txt",true));
        bf.write(" Computer ");
        bf.close();
        int i;
        FileInputStream fis = new FileInputStream("1.txt");
        do
        {
            i = fis.read();
            if (i!= -1)
            {
                System.out.print((char)i);
            }
        }
        while (i!= -1);
        fis.close();
    }
}
