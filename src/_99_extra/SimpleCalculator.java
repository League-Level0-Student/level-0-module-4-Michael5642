package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String user = JOptionPane.showInputDialog("name any number");
String convert = JOptionPane.showInputDialog("name another number");
int use = Integer.parseInt(user);
int con = Integer.parseInt(convert);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "budget calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);
if(operation==0) {
	add(use, con);
}
else if(operation==1) {
	subtract(use, con);
}
else if(operation==2) {
	multiply(use, con);
}
else if(operation==3) {
	divide(use, con);
}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int num1,int num2) {
	double bubba = num1+num2;
	JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + bubba);
	}
static void subtract(int num1,int num2) {
	double babbu = num1-num2;
	JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + babbu);
}
static void multiply(int num1,int num2) {
	double bbbbb = num1*num2;
	JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + bbbbb);
}
static void divide(int num1,int num2) {
	double aaaaa = num1/num2;
	JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + aaaaa);
}
	// 4. Create similar methods for subtraction, multiplication and division.
}