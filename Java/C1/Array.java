import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int myArray[][] = new int[2][3];
        for (int i = 0; i<4; i++)
        {
            for (int j = 0;j<4; j++)
            {
                System.out.println("Enter your number:");
                int a = sc.nextInt();
                myArray[i][j] = a;
            }

        }
        System.out.println(myArray);
    }
}
