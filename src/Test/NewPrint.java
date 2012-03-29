import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewPrint {

	private JFrame frame;
	private JPanel north;
	private JPanel south;
	private JPanel center;
	private JButton sendButton;
	private JButton getFileButton;
	private JTextField printerAdd;

	public void createPrintLayout() {

		frame.getContentPane().removeAll();
		frame.setSize(500, 150);

		printerAdd = new JTextField(15);

		JLabel selectedPrinter = new JLabel("Select Printer: ");
		JLabel selectedFile = new JLabel("selected File Path");

		sendButton = new JButton("Print");

		getFileButton = new JButton("Add File");

		center = new JPanel();
		north = new JPanel();
		south = new JPanel();

		north.add(selectedPrinter);
		north.add(printerAdd);
		north.add(getFileButton);
		north.setBackground(Color.GRAY);

		center.add(selectedFile);

		south.add(sendButton);
		south.setBackground(Color.GRAY);

		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		frame.getContentPane().add(BorderLayout.SOUTH, south);

		frame.setVisible(true);
	}

}
