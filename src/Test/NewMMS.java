import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NewMMS {

	private JFrame frame;

	private JTextArea textContent;
	private JLabel maxNumberCharacters;
	private JLabel receiver;
	private JPanel north;
	private JPanel south;
	private JTextField receiverAdd;
	private JButton sendButton;
	private JButton sendLaterButton;
	private JButton getFileButton;

	public void createMmsLayout() {

		frame.getContentPane().removeAll();

		frame.setSize(500, 500);

		textContent = new JTextArea(38, 33);
		textContent.setLineWrap(true);

		receiverAdd = new JTextField(15);

		receiver = new JLabel("Receiver: ");
		maxNumberCharacters = new JLabel("Max. number of characters");

		sendButton = new JButton("Send");
		sendLaterButton = new JButton("Send later");
		getFileButton = new JButton("Add File");

		JPanel center = new JPanel();
		north = new JPanel();
		south = new JPanel();

		north.add(receiver);
		north.add(receiverAdd);
		north.add(getFileButton);
		north.setBackground(Color.GRAY);

		center.add(textContent);
		center.setBackground(Color.GRAY);

		south.add(maxNumberCharacters);
		south.add(sendLaterButton);
		south.add(sendButton);
		south.setBackground(Color.GRAY);

		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		frame.getContentPane().add(BorderLayout.SOUTH, south);

		frame.setVisible(true);
	}

}
