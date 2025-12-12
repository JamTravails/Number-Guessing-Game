import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws InterruptedException {
	
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	int guess;
	int min = 1;
	int max = 100;
	int attempts = 0;
	int randomNumber;
	int Score = 0;
	
	randomNumber = random.nextInt(max);
	System.out.println("Number Guessing Game\n");
	
	int start = 3;
        for(int i = start ; i > 0 ; i--){
            System.out.print(i + " ");
            Thread.sleep(500);
            }
            System.out.println("\nPlay!");
	
	System.out.printf("Guess a number between %d-%d: ", min, max);
	guess = scanner.nextInt();
	while(guess != randomNumber ){
	    if (attempts == 5){
	                System.out.println("GAME OVER! Maximum number of attempts reached!!! "); break;
	                }
	    else if(guess < 1 || guess > 100){
	        System.out.print("Pick a number between 1-100 "); 
	      guess = scanner.nextInt();
	        }
	   else if(guess > randomNumber){
	         System.out.printf("Guess to HIGH try again! %(d attempts remaining ", (attempts - 5) );
	    guess = scanner.nextInt();
	        }
	        else if(guess < randomNumber){
	             System.out.printf("Guess to LOW try again! %(d attempts remaining ", (attempts - 5) );
	    guess = scanner.nextInt();
	            }
	            
	   
	    attempts++;
	    if (guess == randomNumber){
	                	System.out.println("WON!!: " + randomNumber);   }
	    else if(attempts == 5){
	System.out.println(randomNumber + " is the correct guess.");    }
	    }
	    
	
	
   

switch(attempts){
    case 0 : System.out.println("Score " + 5 * 10);break;
    case 1 : System.out.println("Score " + 4 * 10);break;
    case 2 : System.out.println("Score " + 3 * 10);break;
    case 3 : System.out.println("Score " + 2 * 10);
    break;
   case 4 : System.out.println("Score " + 1 * 10);
   break;
    }
    System.out.println("Score " + Score);

	scanner.close();
	
	}
}