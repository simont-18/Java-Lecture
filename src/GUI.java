import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private int n1, n2;
	private JLabel equation;
	private JTextField ansField;
	private JButton check, exit;

	GUI() {
		super("Addition practice!");
		this.setLayout(new BorderLayout());
		
		generateNumber();
		
		equation = new JLabel(Integer.toString(n1) + " + " + Integer.toString(n2) + " = ");
		this.add(equation, BorderLayout.WEST);
		
		ansField = new JTextField(2);
		this.add(ansField, BorderLayout.CENTER);
		
		check = new JButton("Click to check");
		check.addActionListener(this);
		this.add(check, BorderLayout.EAST);
		
		exit = new JButton("Exit");
		exit.addActionListener(new Exit());
		this.add(exit, BorderLayout.SOUTH);
	}

	public void generateNumber() {
		Random ran = new Random();
		n1 = ran.nextInt(10);
		n2 = ran.nextInt(10);
	}
	
	public void next() {
		generateNumber();
		equation.setText((Integer.toString(n1) + " + " + Integer.toString(n2) + " = "));
		ansField.setText("");
		ansField.selectAll();
	}
	
	@Override
	public void actionPerformed(ActionEvent x) throws NumberFormatException{
		try {
			if(n1 + n2 == Integer.parseInt(ansField.getText())) {
				JOptionPane.showMessageDialog(null, "Correct!");
				next();
			} else
				JOptionPane.showMessageDialog(null, "Try again", "Wrong!", JOptionPane.ERROR_MESSAGE);
	
		} catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, nfe, "Error!", JOptionPane.ERROR_MESSAGE);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e, "Error!", JOptionPane.ERROR_MESSAGE);
		}
	}
}
