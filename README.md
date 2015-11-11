# Hartzell_Jordyn_Homework_9 
## Introduction
### Outline
### References
# Code
```java
import java.util.Scanner;
public class Addition_Game_Methods_and_Loops {
	public static void main(String[] args) {
		/* This line was used to make sure the program was running.
		System.out.println("Hello");*/
		
		// Output opening message and instructions
		System.out.println("Welcome to the addition game!");
		System.out.println("Please input integers only.");
		System.out.println("Good luck!\n");
		
		// Call the addition game method to run
		additonGameMethod();
	}	
	// Create method for the addition game
	public static void additonGameMethod(){
		/* This was used to check that the method was working.
		System.out.println("If this runs, additionGameMethod works");*/
		
		// Establish variables for difficulty and score
		int difficulty = 10;
		int score = 0;
		
		
		// For loop to increment 4 rounds
		for(int round = 1; round <= 4; round++){
			
			// This boolean was copied from Jeremy Evert's Addition Game on Github.
			boolean isAnswerCorrect = checkStudentAnswer(difficulty);
			
			// Output based on correct answer
			if(isAnswerCorrect){
				// Increase and output score
				score = score + difficulty;
				System.out.println("You have earned " + score + " points.");
				
				if(round < 4){
					// Increase and output difficulty
					difficulty = difficulty * 10;
					System.out.println("Your difficulty has increased to " + difficulty + ".");
				}
			// Output based on incorrect answer
			}else{
				System.out.println("Your score is still " + score + ".");
				if(round < 4){
					if(difficulty > 10){
						// Decrease and output difficulty
						difficulty = difficulty / 10;
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
```
## Console
Examples:
This is an example of all correct answers. The score and difficulty increase every round.
```
Welcome to the addition game!
Please input integers only.
Good luck!

What is 1 + 7? 8
Correct!
You have earned 10 points.
Your difficulty has increased to 100.
End of round 1

What is 12 + 8? 20
Correct!
You have earned 110 points.
Your difficulty has increased to 1000.
End of round 2

What is 627 + 414? 1041
Correct!
You have earned 1110 points.
Your difficulty has increased to 10000.
End of round 3

What is 2788 + 87? 2875
Correct!
You have earned 11110 points.
End of round 4

You have reached the end of the game.
Total Score: 11110/11110
```
This is an example with all incorrect answers. The score never increases, and the difficulty never decreases because it is already at the lowest difficulty.
```
Welcome to the addition game!
Please input integers only.
Good luck!

What is 4 + 3? 0
Sorry, that was incorrect.
The correct answer was 7.
Your score is still 0.
End of round 1

What is 9 + 2? 0
Sorry, that was incorrect.
The correct answer was 11.
Your score is still 0.
End of round 2

What is 5 + 5? 0
Sorry, that was incorrect.
The correct answer was 10.
Your score is still 0.
End of round 3

What is 6 + 0? 0
Sorry, that was incorrect.
The correct answer was 6.
Your score is still 0.
End of round 4

You have reached the end of the game.
Total Score: 0/11110
```
This example shows an incorrect answer during rounds 3 and 4. The score does not increase for these rounds, and the difficulty decreases for both rounds.
```
Welcome to the addition game!
Please input integers only.
Good luck!

What is 5 + 2? 7
Correct!
You have earned 10 points.
Your difficulty has increased to 100.
End of round 1

What is 69 + 63? 132
Correct!
You have earned 110 points.
Your difficulty has increased to 1000.
End of round 2

What is 934 + 955? 0
Sorry, that was incorrect.
The correct answer was 1889.
Your score is still 110.
Your difficulty has decreased to 100.
End of round 3

What is 12 + 87? 0
Sorry, that was incorrect.
The correct answer was 99.
Your score is still 110.
End of round 4

You have reached the end of the game.
Total Score: 110/11110
```
This example shows an incorrect answer in round 3. The amount of points awarded for the correct answer has decreased along with the difficulty.
```
Welcome to the addition game!
Please input integers only.
Good luck!

What is 5 + 2? 7
Correct!
You have earned 10 points.
Your difficulty has increased to 100.
End of round 1

What is 78 + 20? 98
Correct!
You have earned 110 points.
Your difficulty has increased to 1000.
End of round 2

What is 787 + 609? 0
Sorry, that was incorrect.
The correct answer was 1396.
Your score is still 110.
Your difficulty has decreased to 100.
End of round 3

What is 34 + 77? 111
Correct!
You have earned 210 points.
End of round 4

You have reached the end of the game.
Total Score: 210/11110
```
### Command Prompt
First I navigated to my project.
```
C:\Users\Jordyn>e:

E:\>cd Jordyn_CS1_Workspace

E:\Jordyn_CS1_Workspace>cd Hartzell_Jordyn_Homework_9

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>dir
 Volume in drive E is Lexar
 Volume Serial Number is 585B-9A7C

 Directory of E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9

11/10/2015  05:46 PM    <DIR>          .
11/10/2015  05:46 PM    <DIR>          ..
11/10/2015  05:46 PM               402 .project
11/10/2015  05:46 PM    <DIR>          src
11/10/2015  05:46 PM    <DIR>          bin
11/10/2015  05:46 PM               232 .classpath
               2 File(s)            634 bytes
               4 Dir(s)   7,915,307,008 bytes free
```
After I found my project, I used the GitHub instructions to sync my local repo to the remote repo. I also had to configure my user information to avoid an error.
```
E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>echo # Hartzell_Jordyn_Homewo
rk_9 >> README.md

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git init
Initialized empty Git repository in E:/Jordyn_CS1_Workspace/Hartzell_Jordyn_Home
work_9/.git/

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git config user.name "Jordyn
Hartzell"

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git config user.email "hartze
llj@student.swosu.edu"

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git add README.md

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git commit -m "first commit"
[master (root-commit) 7966000] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git remote add origin https:/
/github.com/Jordyn-Hartzell/Hartzell_Jordyn_Homework_9.git

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git push -u origin master
Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Counting objects: 3, done.
Writing objects: 100% (3/3), 251 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/Hartzell_Jordyn_Homework_9.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
```
I didn't want to work out of my master branch, so I set up a new development branch.
```
E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git checkout -b dev
Switched to a new branch 'dev'

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git add .

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git commit -m "First running
line of code"
[dev 507b5b8] First running line of code
 4 files changed, 30 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/Addition_Game_Methods_and_Loops.class
 create mode 100644 src/Addition_Game_Methods_and_Loops.java
```
Here I tried to commit and push changes, but the dev branch was not linked to the remote repository.
```
E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git add .

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git commit -m "Added quiz que
stion method"
[dev 7938266] Added quiz question method
 2 files changed, 25 insertions(+), 3 deletions(-)
 rewrite bin/Addition_Game_Methods_and_Loops.class (78%)

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev
```
I used git push -u to set up tracking on my dev branch.
```
E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git push -u origin dev
Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Counting objects: 14, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (14/14), done.
Writing objects: 100% (14/14), 2.71 KiB | 0 bytes/s, done.
Total 14 (delta 3), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/Hartzell_Jordyn_Homework_9.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.
```
After I was satisfied with my code, I merged the working code from the dev branch into the master branch.
```

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git merge dev
Updating 7966000..2178c03
Fast-forward
 .classpath                                |   6 +
 .project                                  |  17 ++
 README.md                                 | 360 ++++++++++++++++++++++++++++++
 bin/Addition_Game_Methods_and_Loops.class | Bin 0 -> 2283 bytes
 src/Addition_Game_Methods_and_Loops.java  |  90 ++++++++
 5 files changed, 473 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/Addition_Game_Methods_and_Loops.class
 create mode 100644 src/Addition_Game_Methods_and_Loops.java
```
I pushed the changes to the remote repository to catch it up to my local repository.
```
E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git add .

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git commit -m "Merged dev cod
e into master branch"
On branch master
Your branch is ahead of 'origin/master' by 7 commits.
  (use "git push" to publish your local commits)
nothing to commit, working directory clean

E:\Jordyn_CS1_Workspace\Hartzell_Jordyn_Homework_9>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/Hartzell_Jordyn_Homework_9.git
   7966000..2178c03  master -> master
```
# Summary