
public class FVCalc {
	public static void main(String[] args){
int CurenrV = Integer.parseInt(args[0]);
double Rate = Double.parseDouble(args[1])/100;
int Years = Integer.parseInt(args[2]);
double FV = (CurenrV*Math.pow((Rate+1), Years));
System.out.println("After " + Years + " years, $" + CurenrV + " saved at " + (Rate * 100) + "% will yield $" + (int)FV);
	}
}
