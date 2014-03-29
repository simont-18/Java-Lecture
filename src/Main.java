import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {
		//write even numbers to file
		writeNumbers(0, false);
		JOptionPane.showMessageDialog(null, "Even numbers written to the file. Press OK to display.", "Message", JOptionPane.INFORMATION_MESSAGE);
		displayContents();
		
		//append odd numbers to file
		writeNumbers(1, true);
		JOptionPane.showMessageDialog(null, "Odd numbers appended to the file. Press OK to display.", "Message", JOptionPane.INFORMATION_MESSAGE);
		displayContents();

	}
	
	public static void writeNumbers(int start, boolean append) throws IOException{
		PrintWriter out = new PrintWriter(new FileOutputStream("numbers.dat", append));
		
		if(append == true)
			out.println();
		
		for(int i = start; i <= 100; i+=2) {
			out.print(i + " ");
		}
		
		if(out != null)
			out.close();
	}
	
	public static void displayContents() throws IOException {
		Scanner in = new Scanner(new FileInputStream("numbers.dat"));
		
		while(in.hasNext()) {
			System.out.println(in.nextLine());
		}
		
		if(in != null)
			in.close();
	}
}
