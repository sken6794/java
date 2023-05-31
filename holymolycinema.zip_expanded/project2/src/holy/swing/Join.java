package holy.swing;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import holy.dao.HMemberDAO;
import holy.vo.HmemberVO;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;

// 회원가입 페이지

public class Join {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JPasswordField passwordField;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join window = new Join();
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
	public Join() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		HMemberDAO hmem = new HMemberDAO();
		frame = new JFrame();
		frame.setFont(new Font("코트라 희망체", Font.PLAIN, 18));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagePanel MainPanel = new ImagePanel(new ImageIcon("C:\\Users\\user\\Desktop\\course\\java\\work\\project2\\src\\image\\join.jpg").getImage());
		frame.setSize(new Dimension(785, 620));
		frame.getContentPane().add(MainPanel);

		textField = new JTextField(); // 아이디
		textField.setFont(new Font("굴림", Font.PLAIN, 18));
		textField.setBounds(303, 176, 197, 32);
		MainPanel.add(textField);
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton("중복확인");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setFont(new Font("굴림체", Font.PLAIN, 12));
		btnNewButton_1.setBounds(523, 180, 97, 23);
		MainPanel.add(btnNewButton_1);
		
		/////////////////// 중복 확인 기능
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(hmem.checkId(textField.getText())){
					JOptionPane.showMessageDialog(null, "이미 존재 하는 아이디 입니다");
				}else {
					JOptionPane.showMessageDialog(null, "가입 가능한 아이디 입니다!");
				}


			}
		});

		
		passwordField = new JPasswordField(); // 비번
		passwordField.setBounds(303, 244, 197, 32);
		MainPanel.add(passwordField);

		textField_2 = new JTextField(); //이름
		textField_2.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_2.setBounds(303, 313, 197, 32);
		MainPanel.add(textField_2);
		textField_2.setColumns(10);
		
		

		textField_3 = new JTextField(); // 폰번호
		textField_3.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_3.setBounds(303, 376, 197, 32);
		MainPanel.add(textField_3);
		textField_3.setColumns(10);

		btnNewButton = new JButton("가입하기-->");
		btnNewButton.setFont(new Font("Neo둥근모", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(557, 458, 146, 32);
		MainPanel.add(btnNewButton);
		
		
		
		
		
		System.out.println("gettext" + textField.getText()); 
		
		//////////////// 가입
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pwd = new String (passwordField.getPassword());
				
				String text = textField_3.getText();
				String textField_3 = text.substring(0, 3)+"-"+text.substring(3, 7)+"-"+text.substring(7, 11);
				
				if(hmem.checkId(textField.getText())){
					JOptionPane.showMessageDialog(null, "이미 존재 하는 아이디 입니다");
				}else {
					HmemberVO hmem2 = new HmemberVO(textField.getText(),pwd,textField_2.getText(),textField_3);
					hmem.join(hmem2);
					JOptionPane.showMessageDialog(null, "가입 완료!");
					
					
					frame.setVisible(false);
					Main main = new Main();
					main.frame.setVisible(true);
					
				}


			}
		});






	}

}
