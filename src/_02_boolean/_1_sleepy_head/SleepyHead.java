package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		/*boolean isWeekend;
		// Write code to ask the user what day it is.
        String date = JOptionPane.showInputDialog("what day is it");
		// Set the boolean isWeekend based on the value they enter
	    if(date.equalsIgnoreCase("Saturday")) {
	    	isWeekend = true;
	    }
	    else if(date.equalsIgnoreCase("Sunday")) {
	    	isWeekend = true;
	    }
	    else {
	    	isWeekend = false;
	    }
		// If it is the weekend, tell the user they get to sleep in.
		if(isWeekend = true) { 
			JOptionPane.showMessageDialog(null, "You get to sleep in!");
			}
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		else {
			JOptionPane.showMessageDialog(null, "get out of bed and go to school");
		}*/	
	
	
		/************************   STAR STUDENT  **************************/

		/*boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String exam = JOptionPane.showInputDialog("what did you score on your last exam?");
		double examScore = Double.parseDouble(exam);
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if(examScore >= 70) {
			passedExam = true;
		}
		else {
			passedExam = false;
		}
		// If the user passed the exam, congratulate them
		if(passedExam == true) {
			JOptionPane.showMessageDialog(null, "You passed the exam, Congratulations");
		}
		// otherwise, wish them better luck next time.
		else {
			JOptionPane.showMessageDialog(null, "You failed the exam, better luck next time");
		}
		*/
	
		/************************  GAME OVER  **************************/

		/*boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is the game over?");
			if (gameOver.equalsIgnoreCase("yes")) {
				gameIsOver = true;
			}
			// If they answer "yes", change gameIsOver to true
			
		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null, "The game is over.");
		*/
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog("what color do I draw with?");
		if(color.equalsIgnoreCase("red")) {
			isRed = true;
		}
		else {isRed = false;}
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog("what shape do I draw?");
		if(shape.equalsIgnoreCase("square")) {
			isSquare = true;
		}
		else {isSquare = false;}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		if(isRed==true && isSquare==true) {
			drawRedSquare();
		}
		else {JOptionPane.showMessageDialog(null, "I don't know how to draw that shape.");}
	//}
	}
	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.setSpeed(30);
		rob.penDown();
		rob.setPenColor(255,0,0);
		for (int i = 0; i < 4; i++) {
			rob.move(180);	
			rob.turn(90);
		}
		
		// Complete the rest of this method
	}	
}
