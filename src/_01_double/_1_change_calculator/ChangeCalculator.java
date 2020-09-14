package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String moneyN = JOptionPane.showInputDialog("how many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nicknum = Integer.parseInt(moneyN);
		// Ask the user how many dimes they have, and convert their answer
String moneyDi = JOptionPane.showInputDialog("how many dimes do you have?");
int dimnum = Integer.parseInt(moneyDi);
		// Ask the user how many quarters they have, and convert their answer
String moneyQ = JOptionPane.showInputDialog("how many quarters do you have?");
int quartnum = Integer.parseInt(moneyQ);
		// Calculate how much money the user has.  Hint: Use a double variable 
double money = (nicknum*0.05)+(dimnum*0.1)+(quartnum*0.25);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, "you have " + money + " dollars");
	}
}

