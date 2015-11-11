import java.util.Scanner;
public class Addition_Game_Methods_and_Loops {
	public static void main(String[] args) {
		//System.out.println("Hello");
		
		
		additionQuizMethod();
	
		
	}
	public static void additionQuizMethod(){
		int score              = 0;
 		int questionDifficulty = 10;
 		
 		// Establish rounds and increment them
 		for(int round=1; round<5; round++){
 		
 		// Generate random numbers
 		int number1 = (int)(Math.random() * questionDifficulty);
 		int number2 = (int)(Math.random() * questionDifficulty);
 		
 		// Present problem to the user
 		System.out.print("\nWhat integer is " + number1 + " + " + 
 				number2 + "? ");
 		
 		// Prompt user input
 		Scanner input = new Scanner(System.in);
 		int answer    = input.nextInt();
 		
 		// Determine if answer was correct
 		int correctAnswer = number1 + number2;
 		
 		// Establish what to do based on input
 		if(answer == correctAnswer){
 			// Give points
 			score += questionDifficulty;
 			System.out.println("Correct!\nYou've earned " + score + 
 					" points.");
 			// Increase difficulty
 			questionDifficulty *= 10;
 			System.out.println("End of round " + round + ".");
 		}else{
 			System.out.println("Incorrect!\nNo points awarded.");
 			// Output correct answer
 			System.out.println("Correct answer was: " + 
 					correctAnswer);
 			// Lessen the difficulty
 			if(questionDifficulty > 10){
 				questionDifficulty /= 10;
 			System.out.println("End of round " + round + ".");
  			}
		
		
		}
		
	}
	}
}

