import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int counter = 1, number = 0, largest = -1;
		
		while(counter <= 10) {
			try {
				number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a single digit number ranging from 0 to 9! (-1 to exit)"));
				if(number == -1)
					System.exit(0);
				else if(number >= 0 && number <= 9) {
					if(number > largest)
						largest = number;
				} else
					throw new Exception("Not a single digit number!");
			
				counter++;
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		JOptionPane.showMessageDialog(null, "The largest number is: " + number, "Result" , JOptionPane.INFORMATION_MESSAGE);
	}
}
