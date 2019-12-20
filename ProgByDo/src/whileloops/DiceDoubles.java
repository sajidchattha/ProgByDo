package whileloops;


import java.util.Random;

public class DiceDoubles {

	public static void main(String[] args) {
		Random r = new Random();
//		int roll_1 = 1 + r.nextInt(3);
//		int roll_2 = 1 + r.nextInt(3);
		int roll_1 = 3;
		int roll_2 = 3;
        while (roll_1 != roll_2) {
        	System.out.println("Roll1 : " + roll_1);
        	System.out.println("Roll2 : " + roll_2);
        	System.out.println( "Keep rolling");
        	
        	
       }
            
            System.out.println( "They matched when\n Roll1 # " + roll_1 + "\nRoll2 # " +  + roll_2);
         
	}
	
}


