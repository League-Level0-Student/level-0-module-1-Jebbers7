package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		//2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "Score = " + score);
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String Answer=JOptionPane.showInputDialog("What is greater than God,\r\n" + 
		"more evil than the devil,\r\n" + 
		"the poor have it,\r\n" + 
		"the rich need it,\r\n" + 
		"and if you eat it, you'll die?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (Answer.equalsIgnoreCase("Nothing")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score += 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong. The answer was nothing.");
}
		// 6. Add some more riddles
String Guess=JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
		"Who buys it, has no use for it.\r\n" + 
		"Who uses it can neither see nor feel it.\r\n" + 
		"What is it?" );
		
	

if(Guess.equalsIgnoreCase("A coffin")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score += 1;
		
}

else {
	JOptionPane.showMessageDialog(null, "Incorrect. the answer was a coffin.");
}}
}

