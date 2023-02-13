import java.io.FileInputStream;
import java.io.IOException;

public class FileWriting
{
    public static void main(String[] args) throws IOException
    {
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
