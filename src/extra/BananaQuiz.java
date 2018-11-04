//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String Monkey = JOptionPane.showInputDialog("do you like bannanas");
		//2. if they say no,
		if (Monkey.equals("no"))  {
		JOptionPane.showMessageDialog(null, "You are Crazy!"); }
		
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		if(Monkey.equals("yes")){
		String Hobby = JOptionPane.showInputDialog("what is your favouite hobby?");
		//	show a pop up that says "<your hobby> is much better with bananas!"
        	JOptionPane.showMessageDialog(null, Hobby +" is much better with bannanas!");}
		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}
	}

