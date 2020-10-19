package _03_char._2_string_methods;

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
String var = "abcdefg";
/*
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
System.out.println(var.charAt(3));
		
		// 3. Print the length of your String to the console.
		//    HINT: .length()
System.out.println(var.length());
		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
int line = 0;
for (int i = 0; i < var.length(); i++) {
	System.out.println(var.charAt(line));
	line = line +1; 
}
*/		
		// 5. Pick a char inside your String, and use a loop to determine\
int kine = 0;


String larry = JOptionPane.showInputDialog("name a letter through a-g");
for (int i = 0; i < var.length(); i++) {
	char scott = var.charAt(kine);
	String lang = String.valueOf(scott);
	if(larry.equalsIgnoreCase(lang)) {
		System.out.println("success!");
		JOptionPane.showMessageDialog(null, "letter " + larry + " is at index: " + kine);
		System.exit(0);
	}
	else {
		kine = kine + 1;
		System.out.println("value of kine: "+kine);
		System.out.println("character: "+lang);
	}
	
	
}
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


