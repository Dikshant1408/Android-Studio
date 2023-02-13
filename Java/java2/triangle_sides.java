import java.util.Scanner;

public class triangle_sides {
    public static void main(String[] args)
    {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Side A");
            System.out.println("2. Side B");
            System.out.println("3. Hypotenuse");
            System.out.println("4. Check whether its a triangle or not");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice Which You Want To Find: ");
            int x = sc.nextInt();

            if (x == 1) {
                System.out.println("Enter Side B: ");
                int SideB = sc.nextInt();
                System.out.println("Enter Hypotenuse: ");
                int Hypotenuse = sc.nextInt();

                double SideA = Math.sqrt((Hypotenuse * Hypotenuse) - (SideB * SideB));
                System.out.println("Side A is : " + SideA);
            } else if (x == 2) {
                System.out.println("Enter Side A: ");
                int SideA = sc.nextInt();
                System.out.println("Enter Hypotenuse: ");
                int Hypotenuse = sc.nextInt();

                double SideB = Math.sqrt((Hypotenuse * Hypotenuse) - (SideA * SideA));
                System.out.println("Side B is : " + SideB);
            } else if (x == 3) {
                System.out.println("Enter Side A: ");
                int SideA = sc.nextInt();
                System.out.println("Enter Side B: ");
                int SideB = sc.nextInt();

                int Hypotenuse = (SideA * SideA) + (SideB * SideB);
                System.out.println("Hypotenuse is : " + Hypotenuse);
            } else if (x == 4) {
                System.out.println("Enter Side A: ");
                int SideA = sc.nextInt();
                System.out.println("Enter Side B: ");
                int SideB = sc.nextInt();
                System.out.println("Enter Hypotenuse: ");
                int Hypotenuse = sc.nextInt();

                if ((Hypotenuse * Hypotenuse) == (SideA * SideA) + (SideB * SideB)) {
                    System.out.println("Its a triangle");
                } else {
                    System.out.println("Its not a triangle");
                }
            }


            else if (x == 5)
            {
                break;
            }


            else
            {
                System.out.println("Wrong Choice");
            }
        }
    }
}

