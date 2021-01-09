//i comented on the pro
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewButtons extends JFrame {
	public Toolkit toolkit;

	public NewButtons() {
		setTitle("Buttons"); // the name of the title
		setSize(300, 300); // creating the window size
		toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width - getWidth() / 2, (size.height - getHeight() / 2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		JLabel lbl1 = new JLabel("First number");
		lbl1.setBounds(30, 20, 80, 30);
		JLabel lbl2 = new JLabel("Second Number");
		lbl2.setBounds(30, 55, 110, 30);
		JLabel lbl3 = new JLabel("Result");
		lbl3.setBounds(30, 90, 80, 30);
		final JTextField txt1 = new JTextField(5);
		txt1.setBounds(145, 20, 50, 30);
		txt1.setText("");
		final JTextField txt2 = new JTextField(5);
		txt2.setBounds(145, 55, 50, 30);
		txt2.setText("");
		final JTextField txt3 = new JTextField(5);
		txt3.setBounds(145, 90, 50, 30);
		JButton division = new JButton("/");
		division.setBounds(150, 125, 110, 30);
		JButton minus = new JButton("-");
		minus.setBounds(150, 160, 110, 30);
		JButton plus = new JButton("+");
		plus.setBounds(30, 125, 110, 30);
		JButton multiplication = new JButton("*");
		multiplication.setBounds(30, 160, 110, 30);
//for get the sum 
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a1 = Integer.parseInt(txt1.getText());
				int a2 = Integer.parseInt(txt2.getText());
				int a3 = a1 + a2;
				txt3.setText(String.valueOf(a3));
			}
		});
		// for dividing
		division.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int a1 = Integer.parseInt(txt1.getText());
				int a2 = Integer.parseInt(txt2.getText());
				int a3 = a1 / a2;
				txt3.setText(String.valueOf(a3));
			}
		});
		// for multiplication
		multiplication.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int a1 = Integer.parseInt(txt1.getText());
				int a2 = Integer.parseInt(txt2.getText());
				int a3 = a1 * a2;
				txt3.setText(String.valueOf(a3));
			}
		});
		// for minus
		minus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int a1 = Integer.parseInt(txt1.getText());
				int a2 = Integer.parseInt(txt2.getText());
				int a3 = a1 - a2;
				txt3.setText(String.valueOf(a3));
			}
		});
		panel.add(lbl1);
		panel.add(lbl2);
		panel.add(lbl3);
		panel.add(txt1);
		panel.add(txt2);
		panel.add(txt3);
		panel.add(plus);
		panel.add(division);
		panel.add(multiplication);
		panel.add(minus);
	}// Buttons

	public static void main(String[] args) {
		NewButtons buttons = new NewButtons();
		buttons.setVisible(true);
	}// main
}// calss
