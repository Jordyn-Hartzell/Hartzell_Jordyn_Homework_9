import java.util.Scanner;
public class Addition_Game_Methods_and_Loops {
	public static void main(String[] args) {
		//System.out.println("Hello");
		
		
		quizQuestions();
		
	}
	public static void quizQuestions(){
		for (int round=1; round<5; round++){
		int score = 0;
		int difficulty = 10;
		int numberOne = (int)(Math.random() * difficulty);
		int numberTwo = (int)(Math.random() * difficulty);
		int correctAnswer = numberOne + numberTwo;
		System.out.println("What is " + numberOne + " + " + numberTwo + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		if(answer == correctAnswer){
			System.out.println("Correct");
			score += difficulty;
			difficulty *= 10;
			System.out.println("End of round " + round + ".\n");
		}
		
}
	}
}
