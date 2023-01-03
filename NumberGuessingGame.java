import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int attempt = 1;
        int no0fGuess = 0, score = 0;
        int originalno = (int) (Math.random()*99+1);
        System.out.println("\t+-- +");
        System.out.println("\t| Welcome to Number Guessing Game |");
        System.out.println("\t+--+\n");
        System.out.println("Guess a Number Between 1 to 100\n");
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
            if(input.hasNextInt())
            {
                no0fGuess = input.nextInt ();
                if(no0fGuess == originalno)
                    {
                        score=score+10;
                        System.out.println("Congratulations!! You won the Game");
                        System.out.println("Your Score is " + score + " and you guessed it in "+ attempt +" attempts");
                        break;
                    }
                
                else if(no0fGuess < originalno)
                    {
                        System.out.println("Your Guess is too small!");
                        System.out.println("Attempts remaining = "+ (10-attempt));
                        score--;
                    }
                else if(no0fGuess > originalno)
                    {
                        System.out.println("Your Guess is too high!");
                        System.out.println("Attempts Remaining = " + (10-attempt));
                        score--;
                    }
                if(attempt==10)
                    {
                        System.out.println("You have exceeded the maximum number of attempts.");
                        System.out.println("Better Luck Next Time!");
                        break;
                    }
                    
                attempt++;
            }
                else{
                        System.out.println("Enter a Valid Number!");
                    }
            }
    }
}