package holy.swing;

import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JPasswordField;
import java.awt.Dimension;
import java.awt.Color;


// 중요!!!!!!!!!!!!!!!!!!!!!
// 다 이어지는 메인 화면!!!!!!!!!!

public class Main {

	public JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagePanel MainPanel = new ImagePanel(new ImageIcon("C:\\Users\\user\\Desktop\\course\\java\\work\\project2\\src\\image\\cinema.jpg").getImage());
		frame.setSize(new Dimension(755, 600));

		frame.setPreferredSize(new Dimension(755, 600));
		frame.getContentPane().add(MainPanel);

		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("둥근모꼴", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				Login log = new Login();
				log.frame.setVisible(true);
			


			}
		});
		btnNewButton.setBounds(161, 241, 97, 23);
		MainPanel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("둥근모꼴", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Join join = new Join();
				join.frame.setVisible(true);
				

			}
		});
		btnNewButton_1.setBounds(493, 241, 97, 23);
		MainPanel.add(btnNewButton_1);

		JPanel panel = new JPanel();
		panel.setBounds(0, 521, 724, -524);
		MainPanel.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 5, 724, 516);
		panel.add(panel_1);
		panel_1.setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(0, 0, 215, 48);
		panel_1.add(passwordField);

		frame.pack();

	}
}
