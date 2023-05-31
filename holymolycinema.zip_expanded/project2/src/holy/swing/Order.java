package holy.swing;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

//예매할지 내역 확인할지 !!!

   

public class Order {

	public JFrame frame;
	String id = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order window = new Order();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Order() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagePanel MainPanel = new ImagePanel(new ImageIcon("C:\\Users\\user\\Desktop\\course\\java\\work\\project2\\src\\image\\order.jpg").getImage());
		frame.setSize(new Dimension(770, 640));
		frame.getContentPane().add(MainPanel);
		
		JButton btnNewButton = new JButton("예매하기");
		btnNewButton.setFont(new Font("Neo둥근모", Font.PLAIN, 40));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(50, 45, 316, 503);
		MainPanel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TicketOrder to = new TicketOrder();
				to.id2=id;
				to.frame.setVisible(true);
				

			}
		});
		
		
		
		JButton btnNewButton_1 = new JButton("예매내역확인");
		btnNewButton_1.setFont(new Font("Neo둥근모", Font.PLAIN, 40));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(389, 45, 325, 503);
		MainPanel.add(btnNewButton_1);
	}
}
