
public class Bill3 {
	public static void main(String[] args) {
	    String name1=args[0];
		String name2=args[1];
		String name3=args[2];
		int Bill = Integer.parseInt(args[3]); 
	    double Bill3=(Bill/3.0);
		 Bill3=Math.ceil(Bill3);
		System.out.println(name3 + "  " + name2 + "  " + name1 + "  " + "pay" + "  " + (int) Bill3 + " Shekels each " );
	} 

}
