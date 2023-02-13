import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling
{
    public static void main(String[] args) throws IOException
    {
        File fi = new File("1.txt");
        fi.createNewFile();
        FileOutputStream fout = new FileOutputStream("1.txt",true);
        System.out.println("Is Exists: "+fi.exists());
        System.out.println("File Size: "+fi.length());
        String s = "Hi! this is file Handling";
        char ch[] = s.toCharArray();
        for (int i = 0; i<s.length(); i++)
        {
            fout.write(ch[i]);
        }
        fout.close();
    }
}
