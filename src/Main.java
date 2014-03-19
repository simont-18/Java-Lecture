import java.util.Random;      //................
public class Main {
	public static void main(String[] args) {
		Random generator = new Random();             //................
		point A=new point();   // call of default const
		point B=new point(7,11); // using const with arg
		
		point p=new point();
		
		point q=new point(4,5);
		
		point k=new point(q);
		
		A.setxy(50,25);
		A.print();
		
		System.out.println(" the new value of x is "+A.getX() +"\n and of Y is "+
				A.getY());
		
		// an array of points
		
		point table[] = new point[10];
		// fill it randomly .......
		for(int i=0;i<10;i++)
		{   
			table[i]=new point();   ///////////
			table[i].setxy(generator.nextInt() % 100,generator.nextInt() %250  );
			table[i].print();
		}	
	}
}

class point {
	private int x, y;
	point() {
		x = 0;
		y = 0;
	}
	
	point(int x, int y) {
		setxy(x,y);
	}
	
	point(point a) {
		setX(a.getX());
		setY(a.getY());
	}
	
	public void setxy(int x, int y) {
		setX(x);
		setY(y);
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void print() {
		System.out.println("point [x=" + x + ", y=" + y + "]");
	}
	
	@Override
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}
}

//--------------------------------------------------------------------------------------------------

//extra #5

//public class Main {
//	 public static String lessThan100( int number ) throws Exception {
//		if (number >=100)
//			throw new Exception("over 100!");// write your code here;
//		return String.format("The Number %d is less than 100",number);
//	}
//	
//	public static void main( String args[] ) {
//		try {
//			System.out.println(lessThan100(89));
//			System.out.println(lessThan100(819));
//
//		}
//		catch( Exception exception ) {
//			System.out.println( exception.toString() ); 
//		}
//	}
//}