package beginnersBook;
import beginnersBook.EncapsulationDemo;

public class EncapsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSSN(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());

	}

}
