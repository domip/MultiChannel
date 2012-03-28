import java.awt.BorderLayout;
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
	private JLabel receiver;
	private JPanel north;
	private JPanel south;
	private JTextField receiverAdd;
	private JButton sendButton;

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

		emailItem = new JMenuItem("New Email");
		emailMenu.add(emailItem);

		printItem = new JMenuItem("New Printjob");
		printMenu.add(printItem);

		aboutItem = new JMenuItem("About");
		helpItem = new JMenuItem("Help");
		questionMarkMenu.add(aboutItem);
		questionMarkMenu.add(helpItem);

	}

	public void createSmsLayout() {

		textContent = new JTextArea(15, 35);
		textContent.setLineWrap(true);

		receiverAdd = new JTextField(10);

		receiver = new JLabel("Receiver: ");

		sendButton = new JButton("Send");

		north = new JPanel();
		south = new JPanel();

		north.add(receiver);
		north.add(receiverAdd);
		south.add(sendButton);

		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.CENTER, textContent);
		frame.getContentPane().add(BorderLayout.SOUTH, south);

	}

	public void createMmsLayout() {
		// TODO
	}

	public void createEmailLayout() {
		// TODO
	}

	public void createPrintLayout() {
		// TODO
	}

}