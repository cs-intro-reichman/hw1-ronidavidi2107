public class Ascend {
	public static void main(String[] args) {
	int N = Integer.parseInt(args[0]);
	int N1 = (int)(Math.random() * N);
	int N2 = ( int)( Math.random() * N);
	int N3 = ( int)(Math.random() * N);
	System.out.println( N1 + " " + N2 + " " + N3); 
	int min = Math.min (N1 ,(Math.min(N2, N3)));
	int max = Math.max ( N1, Math.max(N3, N2));
	int Mid = (N1+N2+N3)- (min+max);
	System.out.println(min + " " + Mid + " " + max);


} }
