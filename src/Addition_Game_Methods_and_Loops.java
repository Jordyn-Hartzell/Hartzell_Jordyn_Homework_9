import java.util.Scanner;
public class Addition_Game_Methods_and_Loops {
	public static void main(String[] args) {
		/* This line was used to make sure the program was running.
		System.out.println("Hello");*/
		
		// Call the addition game method to run
		additonGameMethod();
	}
	// Create method for the addition game
	public static void additonGameMethod(){
		/* This was used to check that the method was working.
		System.out.println("If this runs, additionGameMethod works");*/
		
		// Establish variables for difficulty and score
		int score            = 0;
		int difficulty       = 10;
		int changeInDifficulty = 10;
		
		
		// For loop to increment 4 rounds
		for(int round = 1; round <= 4; round++){
			
			// This boolean and corresponding method was copied from Jeremy Evert's Addition Game on Github.
			boolean isAnswerCorrect = checkStudentAnswer(difficulty);
			
			// Outputs based on correct answer
			if(isAnswerCorrect){
				// Increase and display score
				score = score + difficulty;
				System.out.println("You have earned " + score + " points.");
				
				// Increase and display difficulty
				if(round <= 4){
					difficulty = difficulty * changeInDifficulty;
					System.out.println("Your difficulty has increased to " + difficulty + ".");
			// Outputs based on incorrect answers
			}else{
				System.out.println("You still have " + score + " points.");
				if(round <= 4 && difficulty > 10){
					// Decrease difficulty
					difficulty = difficulty / changeInDifficulty;
					System.out.println("Your difficulty has decreased to " + difficulty + ".");
					}
				}
				
			}
			// Output round number
			System.out.println("End of round " + round + "\n");
		}
		// Message at the end of the game
		System.out.println("You have reached the end of the game.");
		System.out.print("Total Score: " + score + "/11110");
	}	
		/* Part of this method was also copied from Jeremy Evert's Addition Game on Github.*/
		// Create method to check if the answer is correct
		public static boolean checkStudentAnswer(int difficulty) {
		
		/* This was used to check that the method was working.
		System.out.println("If this runs, checkStudentAnswer works");*/
		
		int number1 = (int)(Math.random() * difficulty);
		int number2 = (int)(Math.random() * difficulty);
		
		// Prompt user with question
		System.out.print("What is " + number1 + " + " + number2 +"? ");
		Scanner get = new Scanner(System.in);
		int answer = get.nextInt();
		
		// Correct formula
		int correctAnswer = number1 + number2;
		
		// Output based on correct answer
		if(answer == correctAnswer){
			System.out.println("Correct!");
			return true;
		// Output based on incorrect answer
		}else{
			System.out.println("Sorry, that was incorrect.\nThe correct answer was " 
					+ correctAnswer + ".");
			return false;
		}
	}
}