package holy.swing;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import holy.dao.HMemberDAO;
import holy.vo.HmemberVO;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 로그인 페이지 

public class Login extends JFrame{

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		HMemberDAO hmemberDAO = new HMemberDAO();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String currentDirectory = System.getProperty("user.dir");
		String testpath = currentDirectory + "\\img\\login.jpg";
		ImagePanel MainPanel = new ImagePanel(new ImageIcon(testpath).getImage());
		frame.setSize(new Dimension(755, 600));

		frame.setPreferredSize(new Dimension(755, 600));
		frame.getContentPane().add(MainPanel);

		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 20));
		textField.setBounds(244, 224, 316, 51);
		MainPanel.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 20));
		passwordField.setBounds(244, 314, 318, 48);
		MainPanel.add(passwordField);

		btnNewButton = new JButton("login-->");
		btnNewButton.setBounds(573, 441, 97, 23);
		MainPanel.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				char[] a = passwordField.getPassword();
				String pwd = "";
				for(char b : a) {
					pwd+=b;
				}
				if( hmemberDAO.login(textField.getText(), pwd)) {
					HMemberDAO hd = new HMemberDAO();
					HmemberVO hv = hd.getMem(textField.getText(), pwd);
										
					JOptionPane.showMessageDialog(null, "로그인 성공");
					hv.setMemId(textField.getText());
					Order order = new Order(hv);
					
					order.id=textField.getText();
					frame.setVisible(false);
					order.frame.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}


			}
		});

	}

}
