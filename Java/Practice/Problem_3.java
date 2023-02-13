//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

public class Problem_3
{
    public static void main(String[] args)
    {
        long number = 600851475142L;
        long x = 0L;
        for (int i = 2;i<number;i++)
        {
            while (number%i==0)
            {
                x /= i;
            }
        }
        System.out.println(number);
    }
}
