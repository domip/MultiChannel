import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui {

	private JFrame frame;
	private JMenu programmMenu;
	private JMenu smsMenu;
	private JMenu mmsMenu;
	private JMenu emailMenu;
	private JMenu printMenu;
	private JMenu questionMarkMenu;
	private JMenuItem closeItem;
	private JMenuItem smsItem;
	private JMenuItem mmsItem;
	private JMenuItem emailItem;
	private JMenuItem printItem;
	private JMenuItem aboutItem;
	private JMenuItem helpItem;
	private JTextArea textContent;
	private JLabel maxNumberCharacters;
	private JLabel receiver;
	private JPanel north;
	private JPanel south;
	private JPanel center;
	private JTextField receiverAdd;
	private JButton sendButton;
	private JButton sendLaterButton;
	private JButton getFileButton;
	private JTextField printerAdd;

	public static void main(String[] args) {
		new Gui();
	}

	public Gui() {

		createFrame();

	}

	private void createFrame() {
		frame = new JFrame("MultiChannel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		createMenu();

		frame.setSize(500, 500);
		frame.setVisible(true);
	}

	private void createMenu() {

		JMenuBar bar = new JMenuBar();

		frame.setJMenuBar(bar);
		programmMenu = new JMenu("Programm");

		frame.setJMenuBar(bar);
		smsMenu = new JMenu("SMS");

		frame.setJMenuBar(bar);
		mmsMenu = new JMenu("MMS");

		frame.setJMenuBar(bar);
		emailMenu = new JMenu("Email");

		frame.setJMenuBar(bar);
		printMenu = new JMenu("Print");

		frame.setJMenuBar(bar);
		questionMarkMenu = new JMenu("?");

		bar.add(programmMenu);
		bar.add(smsMenu);
		bar.add(mmsMenu);
		bar.add(emailMenu);
		bar.add(printMenu);
		bar.add(questionMarkMenu);

		createMenuItems();

		// createSmsLayout(); just 4 test

	}

	private void createMenuItems() {

		closeItem = new JMenuItem("Close");
		programmMenu.add(closeItem);
		closeItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				int eingabe = JOptionPane.showConfirmDialog(null,
						"Wirklich Beenden?", "Beenden",
						JOptionPane.YES_NO_OPTION);

				if (eingabe == JOptionPane.NO_OPTION) {
					return;
				} else {
					System.exit(0);
				}

			}
		});

		smsItem = new JMenuItem("New SMS");
		smsMenu.add(smsItem);
		smsItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				createSmsLayout();

			}
		});

		mmsItem = new JMenuItem("New MMS");
		mmsMenu.add(mmsItem);
		mmsItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				createMmsLayout();

			}
		});

		emailItem = new JMenuItem("New Email");
		emailMenu.add(emailItem);
		emailItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				createEmailLayout();
			}
		});

		printItem = new JMenuItem("New Printjob");
		printMenu.add(printItem);
		printItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				createPrintLayout();

			}
		});

		aboutItem = new JMenuItem("About");
		helpItem = new JMenuItem("Help");
		questionMarkMenu.add(aboutItem);
		questionMarkMenu.add(helpItem);

	}

	public void createSmsLayout() {

		frame.getContentPane().removeAll();

		frame.setSize(500, 500);

		textContent = new JTextArea(38, 33);
		textContent.setLineWrap(true);

		receiverAdd = new JTextField(15);

		receiver = new JLabel("Receiver: ");
		maxNumberCharacters = new JLabel("Max. number of characters");

		sendButton = new JButton("Send");
		sendLaterButton = new JButton("Send later");

		JPanel center = new JPanel();
		north = new JPanel();
		south = new JPanel();

		north.add(receiver);
		north.add(receiverAdd);
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

	public void createEmailLayout() {

		frame.getContentPane().removeAll();

		frame.setSize(500, 500);

		textContent = new JTextArea(38, 33);
		textContent.setLineWrap(true);

		receiverAdd = new JTextField(15);

		receiver = new JLabel("Receiver: ");

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

		south.add(sendLaterButton);
		south.add(sendButton);
		south.setBackground(Color.GRAY);

		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		frame.getContentPane().add(BorderLayout.SOUTH, south);

		frame.setVisible(true);
	}

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
