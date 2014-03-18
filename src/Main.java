public class Main {
	 public static String lessThan100( int number ) throws Exception {
		if (number >=100)
			throw new Exception("over 100!");// write your code here;
		return String.format("The Number %d is less than 100",number);
	}
	
	public static void main( String args[] ) {
		try {
			System.out.println(lessThan100(89));
			System.out.println(lessThan100(819));

		}
		catch( Exception exception ) {
			System.out.println( exception.toString() ); 
		}
	}
}