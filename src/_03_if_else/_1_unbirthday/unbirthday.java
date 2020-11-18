package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String Answer=JOptionPane.showInputDialog("Enter your birthday (mm/dd)");
	if (Answer.equals ("11/17")) {
		JOptionPane.showMessageDialog(null,"Happy Birthday!");
	}
	else {
	JOptionPane.showMessageDialog(null, "Merry Unbirthday!");

}
}}
