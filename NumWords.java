
public class NumWords {
	public static void main(String [] args) {
	int numbers = Integer.parseInt(args[0]);
	int hundreds = numbers/100;
	int tens = (numbers/10)%10;
	int ones = numbers % 10;
	System.out.println(hundreds + " " + "hundreds" + " " + tens + " " + "tens" + " "+ ones +" " + "ones");
	

	}
}
