
public class Bill3 {
	public static void main(String[] args) {
		int Bill = Integer.parseInt(args[0]); 
	    String name1=args[1];
		String name2=args[2];
		String name3=args[3];
	    Double Bill3=(Bill/3.0);
		 Bill3=Math.ceil(Bill3);
		System.out.println(name3 + "  " + name2 + "  " + name1 + "  " + "pay" + "  " + Bill3 + " Shekels each " );
	} 

}
