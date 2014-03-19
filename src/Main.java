import java.awt.Point;

import javax.swing.JOptionPane;


public class Main {
	public static void main(String[] args)
	{
  		int x = 0, y = 0, sl = 0;
  		
		x = getNumber("Enter x coordinate: ");	
		y = getNumber("Enter y coordinate: ");
		sl = getNumber("Enter side of Square: ");
		
		//Instantiate the classes
		Point myPoint = new Point(x, y);
  		Square mySquare = new Square(x, y, sl);
  		Cube myCube = new Cube(x, y, sl);

  		//Display the output
  		JOptionPane.showMessageDialog(null, "Point:\n" + myPoint.toString()+
  				"\nSquare:\n" + myPoint.toString() + mySquare.toString()+
  				"\nCube:\n" + myPoint.toString()+ myCube.toString(),
  				"Result", JOptionPane.INFORMATION_MESSAGE); 		
	}	
	
	public static int getNumber(String str)
	{
		String numStr = "";
		int num = 0;
		boolean isValid = false;
		
		//while input is not valid
		while(!isValid)
		{
			numStr = JOptionPane.showInputDialog(str);
			
			if (numStr == null)
			{
				JOptionPane.showMessageDialog(null, "You must enter a valid value. Please try again", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				try
			  	{
		  			//If the number entered is not a number, an error will occur
		  			num = Integer.parseInt(numStr);
		  			isValid = true;
		  			
			  	}
			  	catch (NumberFormatException nfe)
			  	{
		  			//Execute this code if an error is detected
		  			JOptionPane.showMessageDialog(null, "The value you entered is not a valid number. Please try again", "Error", JOptionPane.ERROR_MESSAGE);
			  	}
			}
		}
	  	
	  	return num;
	}
}

class Square extends Point {
	protected int sl;
	Square(int x, int y, int sl) {
		super(x,y);
		this.sl = sl;
	}
	
	public int getSl() {
		return sl;
	}
	
	
	@Override
	public String toString() {
		return "Square [x=" + x + ", y=" + y + ", sl=" + sl + "]";
	}
}

class Cube extends Square {
	Cube(int x, int y, int sl) {
		super(x,y,sl);
	}
	
	@Override
	public String toString() {
		return "Cube [x=" + x + ", y=" + y + ", sl=" + sl + "]";
	}
}