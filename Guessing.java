import java.util.Scanner;

public class Guessing
{
    public static void main(String [] args)
    {
        Scanner scanner =new Scanner(System.in);
        int predefinedNumber = 8;
        int userGuess = -1;
        while (userGuess != predefinedNumber){
            System.out.print("Guess the number: ");
            userGuess = scanner.nextInt();
            if (userGuess == predefinedNumber){
                System.out.println("You passed");
            }else {
                System.out.println("Try again");
            }
    }
        scanner.close();
    }
}