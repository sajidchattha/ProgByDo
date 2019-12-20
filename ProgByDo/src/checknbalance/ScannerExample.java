package checknbalance;

import java.io.IOException;
import java.util.Scanner;
public class ScannerExample {
	
	
   public void inputMethod(Scanner sc){
      System.out.println("Enter name of item: ");
      String name = sc.next();
      System.out.println("Enter price of item: \n");
      String age = sc.next();
      System.out.println("Details "+name+" You are "+age+" years old");
      
   }

   public static void main(String args[]) throws IOException {
      //Instantiating the Scanner class
      
	   boolean condition = true;
	   
	   Scanner sc = new Scanner(System.in);
      ScannerExample obj = new ScannerExample();
      //Calling the method
      
      while(condition=true) {
    		  obj.inputMethod(sc);
      }
   }
}