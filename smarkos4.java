//Sandy Markos
/*
 * csc321
 * Lab #4
 */
import java.util.Scanner;

public class smarkos4
{
        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in);

                System.out.println("Menu:");
                System.out.println("1. Practice");
                System.out.println("2. Patience");
                System.out.println("3. Effort");
                System.out.println("4. Success");

                System.out.println("\nEnter your choice (1-4):");
                int choice = input.nextInt();

                if (choice == 1)
                {
                        System.out.println("Practice makes perfect.");
                }
                else if (choice == 2)
                {
                        System.out.println("Good things take time.");
                }
                else if (choice == 3)
                {
                        System.out.println("Hard work pays off.");
                }
                else if (choice == 4)
                {
                        System.out.println("Success comes from persistence.");
                }
                else
                {
                        System.out.println("Invalid choice.");
                }

                input.close();
        }
}
