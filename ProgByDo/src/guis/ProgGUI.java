package guis;
import javax.swing.*;

public class ProgGUI {

	public static void main(String[] args) {
          
		String name = JOptionPane.showInputDialog("What is your name");
		String ageInput = JOptionPane.showInputDialog("How old are you");
		int success = JOptionPane.showConfirmDialog(null, "Are you sure", "Are you sure", JOptionPane.YES_NO_OPTION);
		
		int age = Integer.parseInt(ageInput);
		
	
        if (success == JOptionPane.YES_OPTION) {
          JOptionPane.showMessageDialog(null, "Welcome");
          System.out.println("I am " + name + " & I am " + age + " years old " );
        }
        else {
           JOptionPane.showMessageDialog(null, "GOODBYE");
           System.out.println("I am " + name + " & I am " + age + " years old " + success );
           System.exit(0);
        }
		
	    
		

		
		
	}

}
