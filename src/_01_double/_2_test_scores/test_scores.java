package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
String test = JOptionPane.showInputDialog("what was your test score out of 100?");
int testScore = Integer.parseInt(test);
testScore = 100*(testScore/99);
if(testScore>=70) {
	JOptionPane.showMessageDialog(null, "Great Job studying!");
}	
else	{
	JOptionPane.showMessageDialog(null, "Study harder next time...");
}
System.out.println(testScore);





	}
}
