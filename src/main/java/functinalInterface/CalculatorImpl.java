package functinalInterface;

interface calculator{
	int switchon(int i);
}

public class CalculatorImpl {

	public static void main(String[] args) {
		
		calculator cal = (i)-> {
			return i;
		};
		
		calculator cal2 = (i)-> i;
	
		int switchon = cal.switchon(2);
		System.out.println(switchon);
	}
	
}
